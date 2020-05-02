class BinaryTree
{
    static class Pair{
        Node node;
        int level;
    }
    static void verticalOrder(Node root)
    {
        // add your code here
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        Pair p = new Pair();
        p.node = root;
        p.level = 0;
        q.add(p);
        while(q.size() > 0){
            
            int N = q.size();
            
            for(int i = 0; i < N; i++){
                
                Pair cp = q.poll();
                
                int level = cp.level;
                Node curr = cp.node;
                
                if(map.containsKey(level)){
                    map.get(level).add(curr.data);
                } else{
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(curr.data);
                    map.put(level,l);
                }
                
                if(curr.left != null){
                    cp = new Pair();
                    cp.level = level - 1;
                    cp.node = curr.left;
                    q.add(cp);
                }
                if(curr.right != null){
                    cp = new Pair();
                    cp.level = level + 1;
                    cp.node = curr.right;
                    q.add(cp);
                }
                
            }
        }
        
        
        
        
        
        for(Integer key : map.keySet()){
            ArrayList<Integer> l = map.get(key);
            for(Integer node : l){
                System.out.print(node + " ");
            }
        }
        
    }
    
    
    
    
    
    
    
    
}