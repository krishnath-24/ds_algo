public class Solution {
    
	public static int minCostPath(int input[][]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
        
        // fill the first column
        
        for(int i=1;i<input.length;i++){
            
            input[i][0]+=input[i-1][0];
        }
        
        //fill the first row
        for(int j=1;j<input[0].length;j++){
            
            input[0][j]+=input[0][j-1];
        }
        
        //fill the table
        
        for(int i=1;i<input.length;i++){
            
            for(int j=1;j<input[0].length;j++){
                
                input[i][j]+=Math.min(input[i-1][j-1],Math.min(input[i-1][j],input[i][j-1]));
            }
        }
        
        return input[input.length-1][input[0].length-1];
        
	}
}