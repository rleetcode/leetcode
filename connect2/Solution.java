/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }    
        root.next = null;
        while(root!=null){
            TreeLinkNode pre = null;
            TreeLinkNode next= null;
            for(;root!=null;root=root.next){
                if(next == null){
                    if(root.left !=null){
                        next = root.left;
                    }else if(root.right !=null){
                        next = root.right;
                    }
                }
                
                if(root.left !=null){
                    if(pre!=null){
                        pre.next= root.left;
                    }
                    pre = root.left;
                }
                if(root.right !=null){
                    if(pre !=null){
                        pre.next= root.right;
                    }
                    pre = root.right;
                }
            }
            root = next;
        }    
    }
}