class GFG
{
    int index = 0;
    Node constructTree(int n, int pre[], char preLN[])
    {
        if(index >= n) {
            return null;
        }
        
        int data = pre[index];
        Node root = new Node(data);
        if(preLN[index++] == 'L'){
            return root;
        }
        else{
            root.left = constructTree(n,pre,preLN);
            root.right = constructTree(n,pre,preLN);
        }
        
        return root;
        
        
    }
}