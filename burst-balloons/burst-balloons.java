class Solution {

         static int[][] dp = new int[501][501];
    static int maxCoins(int[] arr)
    {
        
          for (int[] row : dp) 
         Arrays.fill(row, -1);
        // code here
        int N=arr.length;
        return  solve(arr,0,N-1,1,1);
        
    }
    static int solve(int nums[],int i,int j, int l, int r)
    {
           if(i>j)
        return 0;
    
   if(dp[i][j]!=-1) return dp[i][j];
   if(i==j) return dp[i][j]= nums[i]*l*r;
    
    int max_cost=Integer.MIN_VALUE;
    
   
        int _max=0;
        int temp;
        for(int k=i;k<=j;k++){
            int x= solve(nums,i,k-1,l,nums[k]);
            int y=solve(nums,k+1,j,nums[k],r);
            temp=x+y+nums[k]*l*r;
            if(_max<temp){
                 _max=temp;
            }
        }
        return dp[i][j]= _max;
    }
     
}
