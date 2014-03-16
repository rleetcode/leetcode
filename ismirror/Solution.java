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
    public boolean isMirror(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        Stack<TreeNode> stackp = new Stack<TreeNode>();
        Stack<TreeNode> stackq = new Stack<TreeNode>();
        while(p!=null && q!=null){
            if(p.val != q.val){
                return false;
            }
            if(p.right !=null){
                if(q.left == null){
                    return false;
                }else{
                    stackp.push(p.right);
                    stackq.push(q.left);
                    p.right = null;
                    q.left = null;
                }
            }else{
                if(q.left != null){
                    return false;
                }
            }
            
            if(p.left !=null){
                if(q.right == null){
                    return false;
                }else{
                    p = p.left;
                    q = q.right;
                }
            }else{
                if(q.right != null){
                    return false;
                }
                if(stackp.isEmpty()){
                    p = null;
                }else{
                    p = stackp.pop();
                }
                if(stackq.isEmpty()){
                    q = null;
                }else{
                    q = stackq.pop();
                }
            }
        }
        if(p !=null || q!=null){
            return false;
        }else{
            return true;
        }
        
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
}