import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
        
        int[][] adjMatrix = new int[V][V];
        
        for(int i = 0; i < E; i++){

            int a = s.nextInt();
            int b = s.nextInt();
            
            adjMatrix[a][b] = 1;
            adjMatrix[b][a] = 1;
        }
        
        boolean[] visited = new boolean[V];
        
        for(int i = 0; i < adjMatrix.length; i++){
            
            if(!visited[i]){
                bfs(adjMatrix, visited,i);
            }
        }
        
	}
    
    public static void bfs(int[][] adjMatrix, boolean[] visited, int sv){

        Queue<Integer> q = new LinkedList<Integer>();
        
        q.add(sv);
        visited[sv] = true;
        
        while(!q.isEmpty()){
            
            Integer curr = q.poll();
            
            System.out.print(curr + " ");
            
            for(int i = 0; i < adjMatrix.length; i++){
                
                if(adjMatrix[curr][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        
    
    
    }
    
}

