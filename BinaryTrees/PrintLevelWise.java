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
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Print output and don't return it.
		* Taking input is handled automatically.
		*/
        
        if(root == null) return;
        
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0){
            
            BinaryTreeNode<Integer> curr = q.poll();
            
            System.out.print(curr.data + ":L:");
            if(curr.left != null) {
                System.out.print(curr.left.data + ",R:");
                q.add(curr.left);
            } else{
                System.out.print(-1 + ",R:");
            }
            if(curr.right != null){
                System.out.print(curr.right.data);
                q.add(curr.right);
            } else{
                System.out.print(-1);
            }
			System.out.println();
        }
		
	}
	
}
