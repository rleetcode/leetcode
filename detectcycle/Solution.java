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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        if(head.next == head){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==null || fast.next==null){
                return null;
            }
            if(slow == fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
 
    }
}