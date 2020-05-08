
public class Solution {

	public static int lis(int arr[]) {
		
		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/
        
        int[] dp = new int[arr.length];
        
        int ans = 0;
        
        java.util.Arrays.fill(dp,1);
        
        for(int i = 1; i < arr.length; i++){
            
            for(int j = 0; j < i; j++){
                
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
		
        return ans;

	}	
}
