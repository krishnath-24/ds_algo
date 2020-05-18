class Solution {
    
    List<String> ans = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        
        generate(n, n, "");
        
        return ans;
    }
    
    public void generate(int open, int close, String exp) {
        
        
        if(close < 0 || open < 0) return;
        
        if(close < open) return;
        
        if(open == 0 && close == 0) {
            ans.add(exp);
            return;
        }
        
        generate(open - 1, close, exp + "(");
        generate(open, close - 1, exp + ")");
    }
}