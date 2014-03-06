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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }   
        if(n<=0){
            return head;
        }
        ListNode first = head;
        ListNode second= head;
        int idx=0;
        for(;idx<n;idx++){
            if(first!=null){
                first = first.next;
            }else{
                break;
            }
        }
        if(first == null){
            if(idx==n){
                //remove head;
                return head.next;
            }else{
                return head;
            }
        }
        while(first.next !=null){
            first = first.next;
            second = second.next;
        }
        ListNode tmp = second.next;
        second.next = second.next.next;
        tmp.next = null;
        return head;
    }
}