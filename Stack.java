public class Stack {
    
    public Node head;
    public Node middle;
    public int size;

	/********************************
	
		STRUCTURE OF NODE CLASS

		class Node {
    		int data;
    		Node next;
    		Node prev;
    		Node(int data) {
        		this.data = data;
        		this.next = null;
        		this.prev = null;
    		}
		}

	*******************************/

	Stack() {
        

	}

	public void push(int element) {
        
        Node newNode = new Node(element);

        if(head == null){
            head = newNode;
            middle = newNode;
            
        } else{
            
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            
            if(size % 2 != 0){
                middle = middle.prev;
            } 
            
        }
        size++;
        
	}

	public int pop() {
        
		if(size == 0)
            return 0;   
        else{
            
            int t = head.data;
            head = head.next;
            if(size % 2 != 0){
                
                middle = middle.next;
            } 
            return t;
        }
        
	}
	
	public int getmiddle() {
		// Return 0 if the stack is empty
        if(size == 0)
			return 0;        
        else return middle.data;
	}
		
	public int removeMiddle() {
        
		if(size == 0)	
            
			return 0;   
        else {
   			int t = middle.data;
            
            if(middle.prev != null)
            	middle.prev.next = middle.next;
            if(middle.next != null){
                middle.next.prev = middle.prev;
            }
            
            return t;
        }
	}
		
	public void print() {
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
	} 
}
























    