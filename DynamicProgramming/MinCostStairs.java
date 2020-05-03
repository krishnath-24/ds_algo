class Solution {
    // given a array of cost of each step, can take one or two step,
    // can start from either 0 or 1st index, find min cost to climb the stairs.
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length];
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i = 2; i < cost.length; i++){
            
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }   
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}