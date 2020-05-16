import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();
		int E = in.nextInt();
        
        int[][] matrix = new int[V][V];
        
        for(int i = 0; i < E; i++) {
            
            int u = in.nextInt();
            int v = in.nextInt();
            
            matrix[u][v] = 1;
            matrix[v][u] = 1;
            
        }
        
        boolean[] visited = new boolean[V];

        int src = in.nextInt();
        int dest = in.nextInt();
        
        getPath(src, dest, matrix, visited, "");
		
	}
    
    public static void getPath(int src, int dest, int[][] matrix, boolean[] visited, String path) {
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(src);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(src, src);
        
    	while(q.size() > 0) {
            
            int curr = q.poll();
            
            visited[curr] = true;
            
            if(curr == dest) {
                
                while(map.containsKey(curr)) {
                    
                    System.out.print(curr + " ");
                    
                    if(curr == src) return;
                    
                    curr = map.get(curr);
                }
            }
            
            for(int i = 0; i < matrix.length; i++) {
                
                if(matrix[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    map.put(i,curr);
                    q.add(i);
                }
            }
        }
    }
    
    
}


















