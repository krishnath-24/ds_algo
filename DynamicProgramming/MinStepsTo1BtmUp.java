        
public class Solution {
	
	public static int countStepsTo1(int n){
		
        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int[] dp = new int[n+1];
        
        return helper(dp,n);
	
	}
    
    
    public static int helper(int[] dp, int n){
        
        dp[2] = 1;
        
        for(int i = 3; i <= n; i++){
            
            dp[i] = 1 + dp[i-1];
            
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i],1 + dp[i/2]);
            }
            
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], 1 + dp[i/3]);
            }
        }
        
        return dp[n];
    }
	
}
