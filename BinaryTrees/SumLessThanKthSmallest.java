import java.util.*;

public class Solution {

	public static int solve(Node node, int k){
		
        int[] a = new int[2];
        
        getSum(node,k,a);
        return a[1];
	}
    
    public static void getSum(Node root, int k, int[] a){
        
        if(root == null) return;
        
        getSum(root.left, k, a);
        
        if(a[0] >= k)  return;
        
        a[0]++;
        a[1] += root.data;
        
        getSum(root.right, k, a);
    }

}
