class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
        int tuplesCount = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int c : C) {
            for(int d : D) {
                
                int sum = -(c + d);
                
                map.putIfAbsent(sum,0);
                map.put(sum,map.get(sum)+1);
            }
        }
        
        for(int a : A) {
            
            for(int b : B) {
                
                int sum = a + b;
                
                if(map.containsKey(sum)) {
                    tuplesCount += map.get(sum);
                }
            }
        }
        return tuplesCount;
            
    }
}