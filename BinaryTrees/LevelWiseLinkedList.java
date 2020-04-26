import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		// Write your code here
        if(root == null ) return null;
        
        
        ArrayList<Node<BinaryTreeNode<Integer>>> list = new ArrayList<>();
        
    	Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        
        q.add(root);
        
        while(q.size() > 0){
            
            int N = q.size();
            Node<BinaryTreeNode<Integer>> head = null;
            Node<BinaryTreeNode<Integer>> tail = null;
            
            for(int i = 0; i < N; i++){
                BinaryTreeNode<Integer> curr = q.poll();
                Node<BinaryTreeNode<Integer>> nNode = new Node<>(curr);
                if(head == null){
                    head = nNode;
                    tail = nNode;
                } else{
                    tail.next = nNode;
                    tail = tail.next;
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            list.add(head);
        }
        
        return list;
        
	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
