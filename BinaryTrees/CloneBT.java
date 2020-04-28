class GfG{
    
    public static Tree cloneTree(Tree tree){
       // add code here.
       if(tree == null) return null;
       HashMap<Tree,Tree> map = new HashMap<>();
       fillMap(map,tree);
       clone(map,tree);
       return map.get(tree);
       
     }
     
     static void clone(HashMap<Tree,Tree> map, Tree root){
         
         if(root == null ) return;
         
         clone(map, root.left);
         
         map.get(root).random = map.get(root.random);
         
         clone(map, root.right);
     }
     
     
     
     
     static void fillMap(HashMap<Tree,Tree> map, Tree root){
         
         if(root == null) return;
         
         fillMap(map, root.left);
         
         Tree node = new Tree(root.data);
         node.left = root.left;
         node.right = root.right;
         node.random = root.random;
         map.put(root,node);
         
         fillMap(map, root.right);
         
     }
    
     
}