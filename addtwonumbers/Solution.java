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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode retLN = new ListNode(0);
        ListNode head = retLN;
        int addone = 0;
        while(l1 !=null && l2!=null){
            int val = l1.val + l2.val + addone;
            if(val>=10){
                val = val -10;
                addone = 1;
            }else{
                addone = 0;
            }
            ListNode newNode = new ListNode(val);
            head.next = newNode;
            head = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode rest=null;
        if(l1 != null){
            rest = l1;
        }else if(l2 != null){
            rest = l2;
        }
        while(rest!=null){
            int val = rest.val + addone;
            if(val >=10){
                val = val -10;
                addone =1;
            }else{
                addone =0;
            }
            ListNode newNode = new ListNode(val);
            head.next = newNode;
            head = head.next;
            rest = rest.next;
        }
        if(0 != addone){
            head.next = new ListNode(1);
        }
        return retLN.next;
    }
}