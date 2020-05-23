class Solution {
    public int maxArea(int[] height) {
        
        int water = 0;
        
        int i = 0, j = height.length - 1;
        
        while(i < j) {
            
            int w = j - i;
            
            int h = Math.min(height[j],height[i]);
            
            int currWater = w * h;
            
            water = Math.max(currWater,water);
            
            if(height[i] < height[j]) i++;
            
            else j--;
        }
        return water;
    }
}