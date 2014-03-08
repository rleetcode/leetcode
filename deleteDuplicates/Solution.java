/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
    
        ListNode node = head;
        ListNode next = node.next;
        while(node != null && node.next != null){
            if(node.val == next.val){
                ListNode tmp = next;
                node.next = next.next;
                next = next.next;
                tmp.next = null;   
                tmp = null;
            }else{
                node = node.next;
                next = next.next;
            }
        }
        return head;
    }
}