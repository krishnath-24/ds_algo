import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
    	int[][] matrix = new int[V][V];
        
        for(int i = 0; i < E; i++) {
            
            int u = s.nextInt();
            int v = s.nextInt();
            
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        
        
        
        boolean[] visited = new boolean[V];
        
        dfs(matrix, visited, 0);
        
        for(Boolean vertex : visited) {
            if(!vertex) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        
	}
    
    public static void dfs(int[][] matrix, boolean[] visited, int src) {
        
        visited[src] = true;
        
        for(int i = 0; i < matrix.length; i++) {

            if(!visited[i] && matrix[i][src] == 1){
                visited[i] = true;
            	dfs(matrix, visited, i);
            }
        }
        
    }
    
    
}




















