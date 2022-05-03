class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        
        int[] x= new int[n];
        
        x[0]=1;
        x[1]=2;
        
        for(int i=2; i<n;i++){
            x[i]=x[i-1]+x[i-2];
        }
        
        return x[n-1];
       
    }
}