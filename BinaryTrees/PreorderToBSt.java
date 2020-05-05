
public class Solution {

    public static BinaryTreeNode<Integer> constructBST(int[] preorder) {
        //Write your code here
        
        BinaryTreeNode<Integer> root = create(preorder, 0, preorder.length - 1);
        return root;
        
    }
    
    public static BinaryTreeNode<Integer> create(int[] preorder,int s, int e){
        
        if(s > e){
            return null;
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preorder[s]);
        if(s == e) return root;
        
        int index = getIndex(preorder,s,e,root.data);
        
        root.left = create(preorder,s + 1,index);
        root.right = create(preorder,index + 1,e);
        
        return root;
    }
    
    public static int getIndex(int[] pre, int s, int e, int data){
        
        int i = s;
        
        for(; i <= e; i++){
            if(pre[i] > data) return i - 1;
        }
        return e;
    }
    
}