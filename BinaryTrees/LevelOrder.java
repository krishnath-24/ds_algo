import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    
    

	public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		// Write your code here
        
        if(root == null) return;
        
        Queue<BinaryTreeNode<Integer>>  q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            
            BinaryTreeNode<Integer> curr = q.poll();
            
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                    System.out.println();
                }
            }
            else{
                
                System.out.print(curr.data + " ");
                
                if(curr.left != null) q.add(curr.left);
                
                if(curr.right != null) q.add(curr.right);
            }
        }
	}



}
