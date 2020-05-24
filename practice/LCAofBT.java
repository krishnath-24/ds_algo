/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return null;
        
        if(root.val == p.val || root.val == q.val) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(left != null && right != null) {
            return root;
        }
        
        else if(left == null && right != null) {
            return right;
        }
        
        else if(left != null && right == null) {
            return left;
        }
        
        else return null;
        
    }
}

/*

    if root --> null return null
    
    if(root is p || root is q) return root;
    
    recur on left 
    recur on right
    
    if(left && right) return root;
    
    else if(!left && right) return right;
    
    else if(left && !right) return left;
    
    else return null;
    
    TC : O(n)
    SC : O(1) if(if ignore call stack else O(n))

*/