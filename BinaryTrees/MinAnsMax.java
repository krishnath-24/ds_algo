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

	PairAns class - 
	class PairAns {
		int min;
		int max;
	}

	 */
    
    // class PairAns{
    //     int min;
    //     int max;
    // }
	public static PairAns minMax(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        if(root == null){
            PairAns ans = new PairAns();
            ans.min = Integer.MAX_VALUE;
            ans.max = Integer.MIN_VALUE;
            return ans;
        }
        PairAns left = minMax(root.left);
        PairAns right = minMax(root.right);
        
        PairAns ans = new PairAns();
        
        ans.min = Math.min(left.min, Math.min(right.min, root.data));
        
        ans.max = Math.max(left.max, Math.max(right.max,root.data));
        
        return ans;
        

	}

}
