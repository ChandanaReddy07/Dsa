class Solution {
    public boolean canPartition(int[] nums) {
        
     int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
         int n=nums.length;
      
          if(sum%2!=0){
              return false;}
         
         sum/=2;
     
          boolean t[][] = new boolean[n+1][sum+1];
        for(int i=0;i<sum+1;i++){
            t[0][i]=false; 
        }
        for(int i=0;i<n+1;i++){
            t[i][0]=true; 
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    t[i][j] = t[i-1][j] || t[i-1][j-nums[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];

         
     
    
}
}