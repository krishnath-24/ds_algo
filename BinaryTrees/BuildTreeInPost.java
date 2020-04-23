public class Solution {
    
    static int index = 0;

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

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in){
		
			// Write your code here
        
        index = post.length - 1;
        return helper(post, in, 0, in.length - 1);
        
		
	}
    
    static BinaryTreeNode<Integer> helper(int[] post, int[] in, int inS, int inE){
        if(inS > inE) return null;
        
        int rootData = post[index--];
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        int index = getIndex(in, inS, inE, rootData);
        
        root.right = helper(post, in, index + 1, inE);
        root.left = helper(post, in, inS, index - 1);
        
        return root;
        
    }
    
    static int getIndex(int[] in, int s, int e, int data){
        
        int index = -1;
        
        for(int i = s; i <= e; i++){
            if(in[i] == data){
                index = i;
                break;
            }
        }
        return index;
    }

}




















