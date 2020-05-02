class GfG
{
    boolean found = false;
    public void btWithKleaves(Node root, int k)
    {
        if(root == null){
            System.out.print("-1");
        }
        //add code here.
        helper(root,k);
        if(!found){
            System.out.print("-1");
        }
        System.out.println();
    }
    int helper(Node root, int k){
        if(root == null) return 0;
        
        if(root.left == null && root.right == null) return 1;
        
        int left = helper(root.left,k);
        int right = helper(root.right,k);
        if(left + right == k){
            System.out.print(root.data + " ");
            found = true;
        }
        return left + right;
    }
}