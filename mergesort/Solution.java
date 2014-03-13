/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergesortedlist(ListNode left, ListNode right){
        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }
        ListNode result = new ListNode(0);
        ListNode head = result;
        while(left!=null && right !=null){
            ListNode temp = new ListNode(0);
            if(left.val < right.val){
                temp.val = left.val;
                left = left.next;
            }else{
                temp.val = right.val;
                right = right.next;
            }
            head.next = temp;
            head = head.next;
        }
        ListNode rest = null;
        if(left !=null){
            rest = left;
        }else if(right !=null){
            rest = right;
        }
        while(rest != null){
            ListNode temp = new ListNode(rest.val);
            head.next = temp;
            head = head.next;
            rest = rest.next;
        }
        return result.next;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(fast);
        return mergesortedlist(left,right);
    }
}