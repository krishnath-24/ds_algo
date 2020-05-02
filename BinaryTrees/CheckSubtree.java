class Tree {
    public static boolean isSubtree(Node T, Node S) {
        
        if(T == null && S == null) return true;
        
        if(T == null || S == null) return false;
        
        if(T.data == S.data && isSubtree(T.left, S.left) && isSubtree(T.right,S.right)){
            return true;
        } 
        
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
    
}