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
        if(root == null || root.left == null){
            return;
        }    
        root.next = null;
        TreeLinkNode old = root;
        TreeLinkNode next = null;
        while(old.left!=null){
            if(next == null){
                next = old.left;
            }
            if(old.left !=null){
                old.left.next = old.right;
                if(old.next !=null){
                    old.right.next = old.next.left;
                    old = old.next;
                }else{
                    old.right.next = null;
                    old = next;
                    next = null;
                }
            }
        }
    }
}