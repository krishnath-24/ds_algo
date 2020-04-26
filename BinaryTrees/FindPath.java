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

	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        if(root == null) return null;
        
        if(root.data == data){
            
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            return list;
            
        } else if(root.data < data){
            ArrayList<Integer> right = findPath(root.right, data);
            if(right != null) {
                right.add(root.data);
            }
            return right;
        } else{
            ArrayList<Integer> left = findPath(root.left, data);
            if(left != null){
                left.add(root.data);
            }
            return left;
        }

	}
}