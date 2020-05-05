/******** 
Following is the structure of Linked list node
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}
*********/
import java.util.*;

public class solution {

	public static void changeLL(LinkedListNode<Integer> head) {
		// Write your code here
        
        if(head == null || head.next == null) return;
		 
        Set<Integer> set = new HashSet<>();
        
        LinkedListNode<Integer> temp = head;
        
        
        while(temp != null){
            set.add(temp.data);
            temp = temp.next;
        }
        
        int count = set.size() + 1;
        set = new HashSet<>();
        
        temp = head;
        
        while(temp != null){
            if(set.contains(temp.data)){
                temp.data = count++;
            } else{
                set.add(temp.data);
            }
            temp = temp.next;
        }
        
        
        
	}
}