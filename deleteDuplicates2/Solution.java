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
        if(head ==null || head.next == null){
            return head;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = result;
        ListNode next = result.next;
        ListNode d = null;
        while(true){
            next = pre.next;
            ListNode nn = next.next;
            if(nn == null){
                if(d!=null){
                    pre.next = null;
                    d = null;
                }
                break;
            }
            if(next.val == nn.val){
                d = next;
                pre.next = nn;
            }else{
                if(d!=null){
                    d=null;
                    pre.next = nn;
                }else{
                    pre = pre.next;
                }
            }
        }
        return result.next;
    }
}

