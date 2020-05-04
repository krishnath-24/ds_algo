
public class Solution {
	
	public static int countStepsTo1(int n, int[] dp){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
        
        if(n <= 1) return 0;

        if(dp[n] != -1) return dp[n];
        
        int ans = 1 + countStepsTo1(n - 1);
        
        if(n % 2 == 0){
            ans = Math.min(ans, 1 + countStepsTo1(n / 2));
        }
        
        if(n % 3 == 0){
            ans = Math.min(ans, 1 + countStepsTo1(n / 3));
        }

        dp[n] = ans;
        return ans;
	
	}
	
}
