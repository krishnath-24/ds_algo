import java.util.ArrayList;
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
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
        
        
        printPath(root, k, "");
	}
    
    static void printPath(BinaryTreeNode<Integer> root, int k, String ans){
        
        if(k < 0 || root == null) return;
        
        
        if(k == root.data && root.left == null && root.right == null){
            System.out.println(ans + "" + root.data);
            return;
        }
        
        
        
        printPath(root.left, k - root.data, ans + "" + root.data + " ");
        printPath(root.right, k - root.data, ans + "" + root.data + " ");
         
    }
}
