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

    public static BinaryTreeNode<Integer> constructBST(int[] preorder, int n) {
        //Write your code here
        
        BinaryTreeNode<Integer> root = null;
        
        for(int i = 0; i < preorder.length; i++){
            root = create(root,preorder[i]);
        }
        
        return root;
    }
    
    public static BinaryTreeNode<Integer> create(BinaryTreeNode<Integer> root, int data){
        
        if(root == null) return new BinaryTreeNode<>(data);
        
        if(data <= root.data){
            root.left = create(root.left,data);
        } else{
            root.right = create(root.right, data);
        }
        return root;
        
    }
        
}
    