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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }    
        
        ListNode result = new ListNode(Integer.MIN_VALUE);
        result.next = head;
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            ListNode next = cur.next;
            ListNode nn = next.next;
            if(next.val>=cur.val){
                cur = cur.next;
                continue;
            }else{
                cur.next = null;
                ListNode find = result;
                while(find.next != null){
                    if(find.next.val>=next.val){ //find and insert
                        ListNode temp = find.next;
                        find.next = next;
                        next.next = temp;
                        break;
                    }else{
                        find = find.next;
                    }
                }
                cur.next = nn;
            }
        }
        return result.next;
    }
}