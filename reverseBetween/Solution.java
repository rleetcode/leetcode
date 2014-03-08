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
    public ListNode reverse(ListNode head){
        if(head ==null || head.next ==null){
            return head;
        }

        ListNode pre = null;
        ListNode next = head;
        while(next!=null){
            ListNode nn = next.next;
            next.next = pre;
            pre = next;
            next = nn;
        }
        return pre;
    }
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n){
            return head;
        }    
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode mpre = result;
        ListNode nNode = result.next;
        while(m-1>0){
            mpre = mpre.next;
            nNode = nNode.next;
            m--;
            n--;
        }
        ListNode mNode = mpre.next;
        if(n==m+1){
            nNode = mNode.next;
            int tmp = mNode.val;
            mNode.val = nNode.val;
            nNode.val = tmp;
        }else{
            while(n-1>0){
                nNode = nNode.next;
                n--;
            }
            ListNode lastpartHeader = nNode.next;
            nNode.next = null;
            ListNode reversedHeader = reverse(mNode);
            mpre.next = reversedHeader;
            mNode.next = lastpartHeader;
        }
        return result.next;
    }
}