static int countDistinctWays(int n){
	     
	 // if we can take 3 or 5 or 10 steps, count total possible distinct ways to 
     // reach given score    
	     int[] dp = new int[n + 1];
	     
	     
	     dp[0] = 1;
	     
	     for(int i = 3; i <= n; i++){
	         dp[i] += dp[i - 3];
	     }
	     for(int i = 5; i <= n; i++){
	         dp[i] += dp[i - 5];
	     }
	     for(int i = 10; i <= n; i++){
	         dp[i] += dp[i - 10];
	     }
	     return dp[n];
	 }
