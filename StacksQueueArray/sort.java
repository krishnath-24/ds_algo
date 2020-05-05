
public class Solution {

	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if(head == null || head.next == null) return head;
        
        LinkedListNode<Integer> inc;
        LinkedListNode<Integer> incT;
        
        LinkedListNode<Integer> dec;
        LinkedListNode<Integer> decT;
        
        inc = head;
        incT = inc;
        
        dec = head.next;
        decT = dec;
        
        LinkedListNode<Integer> temp = head.next.next;
        boolean increasing = true;
        while(temp != null){
            
            if(increasing){
                incT.next = temp;
                incT = temp;
            } else{
                decT.next = temp;
                decT = temp;
            }
            increasing = !increasing;
            temp = temp.next;
        }
        
        if(decT != null) decT.next = null;
        if(incT != null) incT.next = null;
        
        return merge(inc,reverse(dec));
	}
    
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> h1, LinkedListNode<Integer> h2){
        
        LinkedListNode<Integer> head = null,tail = null;
        
        
        while(h1 != null && h2 != null){
            
            if(h1.data < h2.data){
                if(head == null){
                    head = h1;
                    tail = h1;
                } else{
                    tail.next = h1;
                    tail = h1;
                        
                }
                h1 = h1.next;
            } else{
                if(head == null){
                    head = h2;
                    tail = h2;
                } else{
                    tail.next = h2;
                    tail = h2;
                }
                h2 = h2.next;
            }
        }
        
        while(h1 != null){
            if(head == null){
                    head = h1;
                    tail = h1;
                } else{
                    tail.next = h1;
                    tail = h1;
                        
                }
                h1 = h1.next;
        }
        
        while(h2 != null){
            if(head == null){
                    head = h2;
                    tail = h2;
                } else{
                    tail.next = h2;
                    tail = h2;
                }
                h2 = h2.next;
        }
        return head;
    }
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        if(head == null || head.next == null) return head;
        
        LinkedListNode<Integer> prev = head;
        
        LinkedListNode<Integer> next = reverse(head.next);
        
        prev.next.next = prev;
        prev.next = null;
        
        return next;
    }

}















