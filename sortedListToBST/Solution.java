/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        TreeNode result = new TreeNode(0);
        if(head.next == null){
            result.val = head.val;
            return result;
        }
        ListNode fakehead = new ListNode(0);
        fakehead.next= head;
        ListNode slow = fakehead;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        result.val = slow.next.val;
        if(slow.next != null){
            result.right = sortedListToBST(slow.next.next);
        }
        slow.next = null;
        result.left = sortedListToBST(fakehead.next);
        
        return result;
    }
}