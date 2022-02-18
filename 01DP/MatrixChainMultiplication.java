class Solution{
    static int[][] dp = new int[100][100];
    static int matrixMultiplication(int N, int arr[])
    {
        
          for (int[] row : dp) 
         Arrays.fill(row, -1);
        // code here
        return  MatrixChainOrder(arr,1,N-1);
        
    }
    static int MatrixChainOrder(int p[], int i, int j)
    {
      
        if (i == j)
            return 0;
            
              if (dp[i][j] != -1) 
               {
                    return dp[i][j];
                }
           dp[i][j] =  Integer.MAX_VALUE;
 
      
        for (int k = i; k < j; k++)
        {
            int count = MatrixChainOrder(p, i, k)
                        + MatrixChainOrder(p, k + 1, j)
                        + p[i - 1] * p[k] * p[j];
 
            if (count <  dp[i][j])
                 dp[i][j] = count;
        }
 
    
        return  dp[i][j];
    }

}
