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

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
        
        return helper(pre, in, 0, pre.length - 1, 0, in.length - 1);
		
	}
    
    static BinaryTreeNode<Integer> helper(int[] pre, int[] in, int preS, int preE, int inS, int inE){
        
        if(preS > preE) return null;
        
        int rootData = pre[preS];
        
        int rootIndex = -1;
        
        for(int i = inS; i <= inE; i++){
            if(in[i] == rootData) {rootIndex = i; break;}
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        if(preS == preE) return root;
        
        int leftInS, leftInE, rightInS, rightInE, leftPreS, leftPreE, rightPreS, rightPreE;
        
        leftInS = inS;
        leftInE = rootIndex - 1;
        rightInS = rootIndex + 1;
        rightInE = inE;
        leftPreS = preS + 1;
        leftPreE = leftPreS + leftInE - leftInS;
        rightPreS = leftPreE + 1;
        rightPreE = preE;
        
        root.left = helper(pre, in, leftPreS, leftPreE, leftInS, leftInE);
        
        root.right = helper(pre, in, rightPreS, rightPreE, rightInS, rightInE);
        
        return root;
        
    }

}













