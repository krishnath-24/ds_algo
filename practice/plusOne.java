class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1, sum = 0;
        
        for(int i = digits.length - 1; i >= 0; i--) {
            
            sum = digits[i] + carry;
            
            digits[i] = sum % 10;
            
            carry = sum / 10;
        }
        
        if(carry == 0) return digits;
        
        else {
            
            int[] ans = new int[digits.length + 1];
            
            ans[0] = 1;
            int i = 1;
            
            for(int item : digits) {
                ans[i++] = item;
                
            }
            return ans;
        }
    }
}