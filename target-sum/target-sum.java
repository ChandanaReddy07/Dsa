class Solution {
    public int findTargetSumWays(int[] a, int sum) {
        int n=a.length;
        sum=Math.abs(sum);
         int s=0;
    for(int i=0;i<n;i++)
         s+=a[i];
        
        if((s+sum)%2!=0){
            return 0;
        }
	 
	 int target=(s+sum)/2;
        
        if(s<sum){
            return 0;
        }
	
     
   
          int[][] dp=new int[n + 1][target + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= target; i++)
        dp[0][i] = 0;
    for (int i = 1; i <= n; i++)
        dp[i][0] = 1;
 
    for (int i = 1; i <= n; i++)
    {
        for (int j = 0; j <= target; j++)
        {
          
            if (a[i - 1] <= j)
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - a[i - 1]]; 
            else
                  dp[i][j] = dp[i - 1][j];
        }
    }
       // System.out.println("ha"+target);

    return dp[n][target];
    
    }


}