/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode(0);
        if(inorder.length != postorder.length){
            return root;
        }
        int len = inorder.length;
        if(len == 0){
            return null;
        }
        if(len == 1){
            root.val = inorder[0];
            return root;
        }
        root.val = postorder[len-1];
        int idx = 0;
        for(;idx<len;idx++){
            if(inorder[idx] == root.val){
                break;
            }
        }
        if(idx !=0){
            root.left = buildTree(Arrays.copyOfRange(inorder,0,idx), Arrays.copyOfRange(postorder,0,idx));
        }
        if(idx != len-1){
            root.right= buildTree(Arrays.copyOfRange(inorder,idx+1,len), Arrays.copyOfRange(postorder,idx,len-1));
        }
        
        return root;
    }
}