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
    public TreeNode sortedArrayToBST(int[] num) {
        TreeNode result = new TreeNode(0);
        if(0 == num.length){
            return null;
        }else if(1 == num.length){
            result.val = num[0];
            return result;
        }
        
        int halfidx = num.length/2;
        result.val = num[halfidx];
        result.left = sortedArrayToBST(Arrays.copyOfRange(num,0,halfidx));
        if(halfidx != num.length-1){
            result.right = sortedArrayToBST(Arrays.copyOfRange(num, halfidx+1,num.length));
        }
        return result;
    }
}