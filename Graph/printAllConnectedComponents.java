import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
        boolean[] visited = new boolean[V];
        
        
        for(int i = 0; i < E; i++) {
            
            int u = s.nextInt();
            int v = s.nextInt();
            
            matrix[u][v] = 1;
            matrix[v][u] = 1;
            
        }
        
        
        for(int i = 0; i < V; i++) {

            if(visited[i]) continue;
            
            ArrayList<Integer> list = new ArrayList<>();
            
            getComponent(matrix, visited, i, list);
            
            Collections.sort(list);
            
            for(Integer vertex : list ) {
                System.out.print(vertex + " ");
            }
            if(list.size() != 0) {
                System.out.println();
            }
            
        }
        
	}
    
    public static void getComponent(int[][] matrix, boolean[] visited, int src, ArrayList<Integer> list) {
        
        list.add(src);
        visited[src] = true;
        
        for(int i = 0; i < matrix.length; i++) {
            
            if(!visited[i] && matrix[src][i] == 1) {
                visited[i] = true;
                getComponent(matrix, visited, i, list);
            }
        } 
        
    }
}



















