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
    public int findBottomLeftValue(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        
        Integer last = root.val;
        
        q.add(root);
        
        while(q.size() > 0){
            
            int N = q.size();
            
            for(int i = 0; i < N; i++){
                
                TreeNode curr = q.poll();
                
                if(i == 0) last = curr.val;
                
                if(curr.left != null) q.add(curr.left);
                
                if(curr.right != null) q.add(curr.right);
                
            }
        }
        
        return last;
        
    }
}