class GfG
{
    public static boolean isSymmetric(Node root)
    {
        return root == null || check(root.left, root.right);
        
    }
    
    static boolean check(Node leftSubtree, Node rightSubtree){
        
        if(leftSubtree == null && rightSubtree == null){
            return true;
        }
        
        else if(leftSubtree != null && rightSubtree != null){
            
            return leftSubtree.data == rightSubtree.data && check(leftSubtree.left,rightSubtree.right)&& check(leftSubtree.right,rightSubtree.left);
        }
        
        return false;
        
    }
    
    
    
    
    
    
    
    
    
}