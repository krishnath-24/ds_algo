class Solution {
    public int numSquares(int n) {
        if(n <= 3) return n;
        
        int[] dp = new int[n  + 1];
        
        Arrays.fill(dp,-1);
        
        numSquares(n, dp);
        
        return dp[n];
    }
    
    // dp memoization with recursion approach.
    public int numSquares(int n, int[] dp) {
        
        if(n <= 3) return n;
        
        if(dp[n] != -1) return dp[n];
        
        int ans = Integer.MAX_VALUE;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            
            ans = Math.min(ans,1 + numSquares(n - i * i, dp));
            dp[n] = ans;
        }
        
        return dp[n];
    }

    // Dp bottom up approach.
    public int numSquares(int n) {
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        
        
        for(int i = 2; i <= n; i++) {
            
            dp[i] = i;
            
            for(int j = 1; j * j <= i; j++) {
                
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        return dp[n];
    }
}