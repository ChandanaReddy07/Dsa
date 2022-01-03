class Solution {
    public int coinChange(int[] nums, int sum) {
        
        int n=nums.length;
         int t[][] = new int[n+1][sum+1];
        for(int i=0;i<sum+1;i++){
            t[0][i]=Integer.MAX_VALUE-1;
        }
        for(int i=1;i<n+1;i++){
            t[i][0]=0; 
        }
  
            for(int j=1;j<sum+1;j++){
                if(j%nums[0]==0){
                    t[1][j] = j/nums[0] ; // variation 
                }else{
                    t[1][j] = Integer.MAX_VALUE-1;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    t[i][j] = Math.min(t[i-1][j] , t[i][j-nums[i-1]]+1);   // variation 
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum]==Integer.MAX_VALUE-1? -1 :  t[n][sum];

    }
}