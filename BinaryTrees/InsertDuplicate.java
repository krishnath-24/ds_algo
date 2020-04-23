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
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Write your code here
        
        if(root == null) return;
        
        BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<>(root.data);
        
        duplicate.left = root.left;
        root.left = duplicate;
        
        insertDuplicateNode(duplicate.left);
        insertDuplicateNode(root.right);
		
	}
}
