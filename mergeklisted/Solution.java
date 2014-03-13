import java.util.PriorityQueue;
import java.util.Comparator;
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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size() == 0){
            return null;    
        }
        PriorityQueue<ListNode> pqueue = new PriorityQueue<ListNode>(lists.size(),new Comparator<ListNode>(){
                                                                        public int compare(ListNode a,ListNode b){
                                                                            if(a.val < b.val)
                                                                                return -1;
                                                                            else if(a.val == b.val)
                                                                                return 0;
                                                                            else
                                                                                return 1;
                                                                        }
                                                                    });
        for(ListNode node:lists){
            if(node !=null){
                pqueue.add(node);
            }
        }
        ListNode result = new ListNode(0); 
        ListNode pre = result;
        while(pqueue.size()!=0){
            ListNode cur = pqueue.poll();
            pre.next = cur;
            pre = pre.next;
            if(cur.next != null){
                pqueue.add(cur.next);
            }
        }
        return result.next;
    }
}