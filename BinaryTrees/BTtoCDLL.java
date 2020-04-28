
class Tree
{ 
    Node head;
    Node tail;
    Node bTreeToClist(Node root)
    {
        //your code here
        helper(root);
        if(tail != null){
            tail.right = head;
            head.left = tail;
        }
        return head;
    }
    
    void helper(Node root){
        if(root == null){
            return;
        }
        
        helper(root.left);
        
        if(head == null){
            head = root;
            tail = root;
            
        } else{
            tail.right = root;
            root.left = tail;
            tail = root;
        }
        
        helper(root.right);
        
        
    }
    
}
    
