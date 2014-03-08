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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = head;
        while(next != null){
            ListNode nn = next.next;
            next.next = pre;
            pre = next;
            next = nn;
        }
        return pre;
    }
    public ListNode merge(ListNode front, ListNode second){
        if(front ==null || second ==null){
            return null;
        }
        ListNode l = front;
        ListNode r = second;
        while(l!=null && r!=null){
            ListNode tmp = l.next;
            l.next = r;
            r = r.next;
            l.next.next = tmp;
            l = tmp;
        }
        return front;
    }
    
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next ==null){
            return;
        }          
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reversedSecondHalf = reverse(slow.next);
        slow.next = null;
        merge(head,reversedSecondHalf);
    }
}