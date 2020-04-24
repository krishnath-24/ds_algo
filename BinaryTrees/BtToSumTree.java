class Tree{
    public void toSumTree(Node root){
         //add code here.
         
         change(root);
    }
    static int change(Node root){
        if(root == null) return 0;
        
        int leftSum = change(root.left);
        int rightSum = change(root.right);
        
        int temp = root.data;
        root.data = leftSum + rightSum;
        
        return temp + root.data;
        
    }
    
}