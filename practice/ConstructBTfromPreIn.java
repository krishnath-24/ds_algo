
class Solution {
    
    static int index = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        index = 0;
        return helper(preorder, inorder, 0, inorder.length - 1);
        
    }
    
    public TreeNode helper(int[] preorder, int[] inorder, int s, int e) {
        
        if(index >= preorder.length || s > e) return null;
        
        TreeNode root = new TreeNode(preorder[index++]);
        
        int index = getIndex(root.val,inorder, s, e);
        
        root.left = helper(preorder, inorder, s, index - 1);
        
        root.right = helper(preorder, inorder, index + 1, e);
        
        return root;
    }
    
    public int getIndex(int val, int[] inorder, int s, int e) {
        
        int i = s;
        
        while(i <= e) {
            if(inorder[i] == val) break;
            i++;
        }
        
        return i;
    }
}
