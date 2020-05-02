class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        
        if(root == null) return -1;
        
        Node lca = findLca(root,a,b);
        
        int d1 = findDistanceFromRoot(lca,a,0);
        int d2 = findDistanceFromRoot(lca,b,0);
        return d1 + d2;
    }
    
    int findDistanceFromRoot(Node root, int data, int d){
        
        if(root == null) return 0;
        if(root.data == data) return d;
        
        return findDistanceFromRoot(root.left,data,d+1) + findDistanceFromRoot(root.right, data, d + 1);
        
    }
    
    
    Node findLca(Node root,int a, int b){
        if(root == null) return null;
        
        if(root.data == a || root.data == b){
            return root;
        }
        
        Node left = findLca(root.left, a, b);
        Node right = findLca(root.right, a, b);
        
        if(left == null && right != null) return right;
        
        else if(left != null && right == null) return left;
        
        else if(left == null && right == null ) return null;
        
        else return root;
    }
    
    
    
}