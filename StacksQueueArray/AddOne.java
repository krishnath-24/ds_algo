/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {


	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
   		
        
        if(head == null) return head;
        
        head = reverse(head);
        
        int sum = 0, carry = 1;
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> prev = head;
        
        while(temp != null & carry > 0){
            
            sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;
            prev = temp;
            temp = temp.next;
        }
        
        if(carry > 0) prev.next = new LinkedListNode<>(1);
        
        return reverse(head);
	}
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        
        LinkedListNode<Integer> prev = null, curr = head, next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }


}
