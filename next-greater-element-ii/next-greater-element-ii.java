class Solution {
    public int[] nextGreaterElements(int[] arr) {
        // Your code here
        Stack<Integer> s= new Stack<Integer>();
        
        int[] v=new int[arr.length];
        int n = arr.length;
     
         for(int i=n-1;i>=0;i--){
            
              s.push(arr[i]);
           
                }
                
     
        for(int i=n-1;i>=0;i--){
            
            if(s.size()==0)
            v[i]=-1;
            else if(s.size()>0 && s.peek()>arr[i]) {
                v[i]=s.peek();
            }
            else if(s.size()>0 && s.peek()<=arr[i]){
                while(s.size()>0 && s.peek()<=arr[i]){
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
  
}