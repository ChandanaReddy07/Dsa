public class nxSmalno {
     // Your code here
     Stack<Long> s= new Stack<Long>();
        
     long[] v=new long[arr.length];
     
     //1 3 2 4
     //3 4 4 -1
  
     for(int i=n-1;i>=0;i--){
         
         if(s.size()==0)
         v[i]=-1;
         else if(s.size()>0 && s.peek()<arr[i]) {
             v[i]=s.peek();
         }
         else if(s.size()>0 && s.peek()>arr[i]){
             while(s.size()>0 && s.peek()>=arr[i]){
                 s.pop();
             }
             
             if(s.size()==0){
                 v[i]=-1;
             }
             else{
                 v[i]=s.peek();
             }
         }
         s.push(arr[i]);
     }
    // reverse(v,n);
     return v;
     
}
