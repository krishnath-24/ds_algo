class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            
        if(nums.length == 0) {
            return Collections.emptyList();
        }
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        backtrack(nums, 0, res, list);
        
        res.add(new ArrayList<>());
        
        return res;
    }
    
    public void backtrack(int[] nums, int start, List<List<Integer>> res, List<Integer> list) {
        
        for(int i = start; i < nums.length; i++) {
            
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            backtrack(nums, i + 1, res, list);
            list.remove(list.size() - 1);
        }
    } 
    
}