import java.util.Stack;
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


	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        
        int N = countNodes(root);
        int count = 0;
        
        Stack<BinaryTreeNode<Integer>> in = new Stack<>();
        
        Stack<BinaryTreeNode<Integer>> rev = new Stack<>();
        
        BinaryTreeNode<Integer> temp = root;
        
        while(temp != null){
            in.push(temp);
            temp = temp.left;
        }
        temp = root;
        
        while(temp != null) {
            rev.push(temp);
            temp = temp.right;
        }
        
        while(count < N - 1){
            
            BinaryTreeNode<Integer> top1 = in.peek();
            BinaryTreeNode<Integer> top2 = rev.peek();
            
            if(top1.data + top2.data == s){
                System.out.println(top1.data + " " + top2.data);
                count++;
            	BinaryTreeNode<Integer> t = top1;
            	in.pop();
            
            	if(t.right != null){
            	    t = t.right;
                	while(t != null){
                    	in.push(t);
                    	t = t.left;	
             	    }	
            	}
                t = top2;
                rev.pop();
                count++;
                if(t.left != null) {
                    t = t.left;
                    while(t != null){
                        rev.push(t);
                        t = t.right;
                    }
                }
            } else if(top1.data + top2.data > s){
                
                BinaryTreeNode t = top2;
                rev.pop();
                
                if(t.left != null){
                    t = t.left;
                    while(t != null){
                        rev.push(t);
                        t = t.right;
                    }
                        
                }
                count++;
            }
            else {
                BinaryTreeNode<Integer> t = top1;
                in.pop();
                
                if(t.right != null){
                    t = t.right;
                    while(t != null){
                        in.push(t);
                        t = t.left;
                    }
                }
                count++;
            }
            
        }
		
	}
    
    static int countNodes(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
















