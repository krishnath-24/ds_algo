class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        for(String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            String str = new String(arr);
            
            if(map.containsKey(str)) {
                map.get(str).add(s);
            } else{
                
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(str,list);
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        
        for(String i : map.keySet()) {
            res.add(map.get(i));
        }
        return res;
    }
    
    
}