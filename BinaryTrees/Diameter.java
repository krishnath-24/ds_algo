public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(root == null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        
        return Math.max(leftDiameter, Math.max(rightDiameter, leftHeight + rightHeight + 1));

	}
    
    static int height(BinaryTreeNode<Integer> root){
        
        if(root == null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        return 1 + Math.max(left,right);
    }
	
	
}
