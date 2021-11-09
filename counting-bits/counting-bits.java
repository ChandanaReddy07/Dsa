class Solution {
    public int[] countBits(int num) {
        
        int[] x= new int[num+1];
      
        for(int i=0;i<=num;i++){
        //counting bits
        int count =0;
        int n=i;
            
        for(int j=0;j<32;j++){
               count+=n&1;
               n>>=1;
          }
        
           x[i]=count;
            
        }
        
        return x;
        
    }
}