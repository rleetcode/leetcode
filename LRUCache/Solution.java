import java.util.HashMap;


public class LRUCache {

    public class Node{
        int val;
        int key;
        Node pre;
        Node next;
        Node(int k,int v){
            key = k;
            val = v;
            pre = null;
            next = null;
        }        
    };
    
    int capacity;
    HashMap<Integer,Node> hashmap;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        hashmap = new HashMap<Integer,Node>();
    }
    
    public int get(int key) {
        if(hashmap.containsKey(key)){
            Node fnode = hashmap.get(key);
            //update the queue
            if(fnode == head){
                ;//head, no update
            }else{
                if(fnode == tail){
                    //tail update tail
                    tail = fnode.pre;
                    fnode.pre.next = null;
                }else{
                    //remove it from queue
                    fnode.pre.next = fnode.next;
                    fnode.next.pre = fnode.pre;
                }
                //add it on head
                fnode.next = head;
                fnode.pre = null;
                head.pre = fnode;
                head = fnode;
            }
            
            return fnode.val;
        }else{
            return -1;
        }   
    }
    
    public void set(int key, int value) {
        Node nnode = null;
        if(hashmap.containsKey(key)){
            //update
            nnode = hashmap.get(key);
            nnode.val = value;
            hashmap.put(key, nnode);
        }else{
            //add
            nnode = new Node(key,value);
            hashmap.put(key, nnode);
        }

        //change the queue position
        if(head == null){
            head = nnode;// the queue is empty
            tail = nnode;
        }else{
            if(head != nnode){
                if(nnode.pre != null){
                    if(nnode == tail){//if it's tail
                        tail = nnode.pre;
                        nnode.pre.next = null;
                    }else{
                        nnode.pre.next = nnode.next;
                        nnode.next.pre = nnode.pre;
                    }
                }
                nnode.pre = null;
                nnode.next = head;
                head.pre = nnode;
                head = nnode;   
            }
        }
        if(hashmap.size() > capacity){
            Node rm = tail;
            int rmkey = tail.key;
            hashmap.remove(rmkey);
            tail = rm.pre;
            tail.next = null;
            rm = null;
        }
        
        return;
    }
}