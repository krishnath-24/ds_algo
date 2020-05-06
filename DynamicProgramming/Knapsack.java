
public class Solution {
	
	
	
	public static int knapsack(int[] weight,int value[],int maxWeight){

	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
        
        int[] prev = new int[maxWeight + 1];
        int[] curr = new int[maxWeight + 1];
        
        for(int i = 0; i < value.length; i++){
            
            for(int w = 1; w <= maxWeight; w++){
                
                if(weight[i] <= w){
                    
                    int a = value[i] + prev[w - weight[i]];
                    int b = prev[w];
                    curr[w] = Math.max(a,b);
                    
                } else{
                    curr[w] = prev[w];
                }
            }
            prev = curr;
            curr = new int[maxWeight + 1];
        }
        
        return prev[maxWeight];
		
	}
	
}
