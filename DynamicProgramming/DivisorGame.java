class Solution {
    public boolean divisorGame(int N) {
        
        Boolean[] dp = new Boolean[N + 1];
        return canWin(N, dp);
            
    }
    public boolean canWin(int N, Boolean[] dp){
        if(N <= 1) return false;
        
        if(dp[N] != null){
            return dp[N];
        }
        for(int i = 1; i <= N / 2; i++){
            
            if(N % i == 0){
                if(!canWin(N - i,dp)){
                    dp[N] = true;
                    return true;
                }
            }
        }
        dp[N] = false;
        return false;
    }
}