class BinaryTree  
{ 

    boolean isIsomorphic(Node n1, Node n2)  
    { 
         // code here.
         
         if(n1 == null && n2 == null) return true;
         
         if(n1 != null && n2 == null || n2 != null && n1 == null) return false;
         
         if(n1.data == n2.data){
             boolean a = isIsomorphic(n1.left,n2.left) && isIsomorphic(n1.right,n2.right);
             boolean b = isIsomorphic(n1.left,n2.right) && isIsomorphic(n1.right,n2.left);
             
             return a || b;
         }
         return false;
    }
    
}    