import java.util.Scanner;
import java.util.*;

public class Solution {

  public static ArrayList<Integer> hashPath(boolean[][] graph,int v1,int v2,boolean isVisited[]){
    
      if(isVisited[v1]==true){
        
        return new ArrayList<Integer>();
      }
     
       if(v1==v2){
         
         ArrayList<Integer> list=new ArrayList<Integer>();
         list.add(v1);
         return list;
       }
     
      isVisited[v1]=true;
    
    for(int i=0;i<graph.length;i++){
      
      if(graph[v1][i]){
        
        ArrayList<Integer> x=hashPath(graph,i,v2,isVisited);
        	if(x.size()>0){
        
        	x.add(v1);
              return x;
    	  }
      }
      
    }
     
      

    return new ArrayList<Integer>();
   }
  
	public static void main(String[] args) {
      
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

       boolean [][]addMatrix=new boolean[V][V];
      
      
      for(int i=0;i<E;i++){
        
         int v1=s.nextInt();
        int v2=s.nextInt();
        addMatrix[v1][v2]=true;
        addMatrix[v2][v1]=true;
      }
      
      int v3=s.nextInt();
      int v4=s.nextInt();
      boolean isVisited[]=new boolean[V]; 
                                 
      ArrayList<Integer> ans=hashPath(addMatrix,v3,v4,isVisited);
      
      for(int i: ans){
        System.out.print(i+" ");
      }
	}
}
