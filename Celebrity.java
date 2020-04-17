import java.util.*;

class Celebrity {
    public static int celebrity(int[][] arr, int n) {
        
        
        Stack<Integer> stack = new Stack<>();
        int t = n - 1;
        while(t >= 0){
            stack.push(t);
            t--;
        }
        
        while(true){
            if(stack.size() <= 1){
                break;
            }
            
            int a = stack.pop();
            int b = stack.pop();
            
            if(arr[a][b] == 1){
                stack.push(b);
            } else{
                
                stack.push(a);
            }
        }
        
        if(stack.isEmpty()) return -1;
        
        int a = stack.pop();
        
        for(int i = 0; i < n; i++){
            if(i != a && (arr[i][a] == 0 || arr[a][i] == 1)) return -1;
        }
        
        
        
        return a;
    }
}