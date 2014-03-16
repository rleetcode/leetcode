/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return head;
        }        
        RandomListNode newhead= new RandomListNode(head.label);
        RandomListNode pre = newhead;
        HashMap<RandomListNode, RandomListNode> hashmap = new HashMap<RandomListNode,RandomListNode>();
        hashmap.put(head,newhead);
        RandomListNode p = head.next;
        while(p!=null){
            RandomListNode tmp = new RandomListNode(p.label);
            hashmap.put(p,tmp);
            pre.next= tmp;
            pre = tmp;
            p = p.next;
        }
        p = head;
        pre = newhead;
        while(p!=null){
            if(p.random == null){
                pre.random = null;
            }else{
                pre.random = hashmap.get(p.random);
            }
            p = p.next;
            pre = pre.next;
        }
        return newhead;
    }
}