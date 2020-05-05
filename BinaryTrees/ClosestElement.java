import java.util.*;

public class Solution {

    /* Structure of BinaryTreeNode class is:

        class BinaryTreeNode<T> {
            T data;
            BinaryTreeNode<T> left;
            BinaryTreeNode<T> right;

            public BinaryTreeNode(T data) {
                this.data = data;
            }
        }

    */
    static class Pair{
        int a = Integer.MAX_VALUE;
        int val = Integer.MAX_VALUE;
    }

    public static int minDiff(BinaryTreeNode<Integer> root, int k) {
        //Write your code here
        Pair p = new Pair();
        helper(root, k,p);
        return p.val;
    }

    public static void helper(BinaryTreeNode<Integer> root, int k, Pair p){

        if(root == null) return;

        int diff = Math.abs(k - root.data);

        if(diff < p.a){
            p.a = diff;
            p.val = root.data;
        }

        helper(root.left,k,p);
        helper(root.right,k,p);

    }

}
