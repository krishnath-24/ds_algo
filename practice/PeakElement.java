class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums.length <= 0)  return -1;
        
        int ans = -1;
        
        for(int i = 0; i < nums.length; i++) {
            
            boolean left = true;
            boolean right = true;
            
            if(i - 1 >= 0) {
                left = (nums[i] > nums[i-1]);
            }
            
            if(i + 1 < nums.length) {
                right = nums[i] > nums[i+1];
            }
            
            if(i == 0 && right) ans = i;
            
            if(i == nums.length - 1 && left) ans = i;
            
            if(left && right) ans = i;
            
        }
        return ans;
        
    }

    // TC : O(n);
    // Sc : O(1);


    public int findPeakElement(int[] nums) {
        
        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] > nums[i+1]) return i;
        }
        
        return nums.length - 1;
    }

    // TC : O(n);
    // Sc : O(1);

    public int helper(int[] nums, int l, int r) {
        
        if(l == r) return l;
        
        int mid = l + (r - l) / 2;
        
        if(nums[mid] > nums[mid + 1]) {
            return helper(nums, l, mid);
        }
        
        return helper(nums, mid + 1, r);
    }

    // Tc : O(logn);
    // Sc : O(1);
}