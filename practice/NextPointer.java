                    
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root == null) return root;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0) {
            
            int N = q.size();
            
            Node head = null;
            
            for(int i = 0; i < N; i++) {
                
                Node curr = q.poll();
                
                if(head == null) {
                    head = curr;
                    
                } else {
                    head.next = curr;
                    head = head.next;
                }
                
                if(curr.left != null) q.add(curr.left);
                
                if(curr.right != null) q.add(curr.right);
            }
        }
        
        return root;
        
    }

/*
 Tc : O(n);
 Sc : O(2^h), O(n) is call stack considered
*/


    public Node connect(Node root) {
        
        if(root == null) return root;
        
        if(root.left != null) {
            
            root.left.next = root.right;
        }
        
        if(root.right != null) {
            
            if(root.next != null) {
                root.right.next = root.next.left;
            }
        }
        
        connect(root.left);
        connect(root.right);
        
        return root;
    }

    /*
        Tc : O(n);
        Sc : O(1);
    */
}

















