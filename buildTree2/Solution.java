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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(0);
        if(preorder.length!=inorder.length){
            return null;
        }
        int len = preorder.length;
        if(len == 0){
            return null;
        }
        root.val = preorder[0];
        if(len ==1){
            root.val = preorder[0];
            return root;
        }
        int idx = 0;
        
        for(;idx<len;idx++){
            if(inorder[idx] == root.val){
                break;
            }
        }
        if(idx != 0){
            root.left = buildTree(Arrays.copyOfRange(preorder,1,idx+1),Arrays.copyOfRange(inorder,0,idx));
        }
        if(idx != len-1){
            root.right = buildTree(Arrays.copyOfRange(preorder,idx+1,len),Arrays.copyOfRange(inorder,idx+1,len));
        }
        return root;
    }
}