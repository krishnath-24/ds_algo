
public class mat{
	int [][] matrix;
	
	mat(int [][] mat)
	{
		matrix=mat;
	}
		
	
	    public static mat add(mat a,mat b)
	    {
	      	int n = a.matrix.length;
            int[][] sum = new int[n][n];
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    sum[i][j] = a.matrix[i][j] + b.matrix[i][j];
                }
            }
            mat m = new mat(sum);
            return m;
            
	    }
	    public static mat multiply(mat a,mat b)
	    {
            int x = a.matrix.length;
            int y = b.matrix.length;
            int z = b.matrix[0].length;
            
            
            // System.out.print(r + " " +n);
            
            int[][] ans = new int[x][z];
            for(int i = 0; i < x; i++){
                
                for(int j = 0; j < z; j++){
                    
                    ans[i][j] = 0;
                    
                    for(int k = 0; k < y; k++){
                        
                        ans[i][j] += (a.matrix[i][k] * b.matrix[k][j]);
                        
                    }
                    
                }
            }
            mat m = new mat(ans);
            return m;
	       
	    }
	    public static mat transpose(mat m)
	    {
            int r = m.matrix.length;
            int n = m.matrix[0].length;
            
            int[][] temp = new int[n][r];
            
	    	for(int i = 0; i < r; i++){
                
                for(int j = 0; j < n; j++){
                    temp[j][i] = m.matrix[i][j];
                }
            }
            return new mat(temp);
	    }
	    public static mat rotate(mat m)
	    {
            int[][] temp = transpose(m).matrix;
            
            int i = 0, j = temp.length - 1;
            
            while(i < j){
                int[] t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
                i++;
                j--;
            }
            return new mat(temp);
	    	
	    }
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	 }