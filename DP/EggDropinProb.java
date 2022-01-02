class Solution {
         int[][] dp;
 
    public int twoEggDrop(int n) {
        dp = new int[n+1][3];
        return breakup(n , 2);
    }
    public int breakup(int f , int e){
        if(f == 0 || f == 1)
            return f;
        
        if(e == 1)
            return f;
        if(dp[f][e] != 0)
            return dp[f][e];
        
       dp[f][e]  = Integer.MAX_VALUE;
        
        for(int k = 1; k<f ;k++){
            int tmp = 1 + Math.max(breakup( k - 1 , e - 1) , breakup(f - k , e) );
            
            dp[f][e] = Math.min( dp[f][e] , tmp );
        }
        return  dp[f][e];
    
        
    }
}
