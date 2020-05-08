
public class Solution {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
        
        
        int ans = 0;
        
        int m = input.length;
        int n = input[0].length;
        
        int[][] dp = new int[m][n];
        
        // fill the first row
        for(int i = 0; i < n; i++){
            dp[0][i] = (input[0][i] == 0)? 1 : 0;
        }
        
        // fill the first column
        for(int i = 0; i < m; i++){
            dp[i][0] = (input[i][0] == 0) ? 1 : 0;
        }
        
        for(int i = 1; i < m; i++){
            
            for(int j = 1; j < n; j++){
                
                if(input[i][j] == 0){
                    
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
                
                if(dp[i][j] > ans){
                    ans = dp[i][j];
                }
            }
        }
        
        return ans;

	}

	
}