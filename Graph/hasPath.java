import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
 
        int[][] adj=new int[v][v];
       
        for(int i=0;i<e;i++){
            int v1,v2;
            v1=s.nextInt();
            v2=s.nextInt();
            adj[v1][v2]=1;
            adj[v2][v1]=1;
        }
      int start=s.nextInt();
      int end=s.nextInt();
      boolean ans=haspath(adj,start,end);
      System.out.print(ans);
	}
  public static boolean haspath(int[][] adj,int start,int end){
  
      if(adj[start][end] == 1) return true;
      
      boolean[] visited = new boolean[adj.length];
      
      ArrayList<Integer> list = new ArrayList<>();
      
      list.add(start);
      
      while(list.size() > 0){
          
          int curr = list.remove(0);
          
          if(curr == end) return true;
          
          visited[curr] = true;
          
          for(int i = 0; i < adj.length; i++){
              
              if(adj[curr][i] == 1 && !visited[i] && !list.contains(i)){
                  list.add(i);
              }
          }
          
      }
      return false;

  }
}