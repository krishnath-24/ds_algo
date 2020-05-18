class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        permute(nums, 0, nums.length);
        return ans;
    }
    
    public void permute(int[] nums, int left, int right) {
        
        Integer[] permutation = new Integer[nums.length];
        
        if(left == right) {
            
            for(int i = 0; i < nums.length; i++) {
                
                permutation[i] = nums[i];
            }
            ans.add(Arrays.asList(permutation));
            return;
        }
        
        
        for(int i = left; i < right; i++) {
            swap(nums, i , left);
            permute(nums, left + 1, right);
            swap(nums, i, left);
        }
        
    }
    
    public void swap(int[] nums, int i, int j ) {
        
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}