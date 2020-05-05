import java.util.*;

public class Solution {

    /*	Binary Tree Node class
       
       class BinaryTreeNode<T> {
            T data;
            BinaryTreeNode<T> left;
            BinaryTreeNode<T> right;
            
            public BinaryTreeNode(T data) {
                this.data = data;
            }
        }

    */

    public static boolean deadEnd(BinaryTreeNode<Integer> root) {
        //Write your code here
        
        boolean ans = getAns(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return ans;
    }
    
    public static boolean getAns(BinaryTreeNode<Integer> root, int min, int max){
        if(root == null) return false;
        
        if(min + 1 == root.data && root.data + 1 == max) return true;
        
        return getAns(root.left,min,root.data) || getAns(root.right,root.data,max);
    }
        
}
    