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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p== null && q==null){
            return true;
        }
        Stack<TreeNode> stackp = new Stack<TreeNode>();
        Stack<TreeNode> stackq = new Stack<TreeNode>();
        while(p!=null && q!=null){
            if(p.val != q.val){
                return false;
            }
            if(p.right !=null){
                if(q.right == null){
                    return false;
                }else{
                    stackp.push(p.right);
                    stackq.push(q.right);
                }
            }
            if(p.left !=null){
                if(q.left == null){
                    return false;
                }else{
                    p = p.left;
                    q = q.left;
                }
            }else{
                if(q.left !=null){
                    return false;
                }else{
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
            
        }
        if(p!=null || q!=null){
            return false;
        }else{
            return true;
        }
    }
}