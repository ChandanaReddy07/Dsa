class Solution {
//     public boolean canPartition(int[] nums) {
        
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//         }
        
//         if(sum%2==0)
//         return util(nums,sum/2,nums.length);
//         else
//             return false;    
//     }
    
//     public boolean util(int[] arr,int sum,int n){
        
//         if(sum==0){
//             return true;
//         }
//         if(n==0){
//             return false;
//         }
        
//         if(arr[n-1]<=sum){
//             return util(arr,sum-arr[n-1],n-1) || util(arr,sum,n-1);
//         }
//             return util(arr,sum,n-1);
//     }
    
     public boolean canPartition(int[] nums) {
         
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
         
         
//          boolean[][] arr= new boolean[nums.length+1][sum+1];
        
//         if(sum%2==0){
            
//             sum/=2;
            
//             for(int i=0;i<nums.length+1;i++){
//                 for(int j=0;j<sum+1;j++)
//                 {
//                     if(j==0){
//                         arr[i][j]=true;
//                     }
//                     else if(i==0){
//                          arr[i][j]=false;
//                     }
//                 }
//             }
//               for(int i=1;i<nums.length;i++){
//                 for(int j=1;j<sum;j++)
//                 {
//                     if(nums[i]<=j){
//                     arr[i][j]= arr[i][j - nums[i]] || arr[i-1][j];
//         }
//                     else
//                         arr[i][j]=arr[i-1][j];
//                 }
//             }
            
            
            
//         }
//          else {
//              return false;
//          }
         
//          return arr[nums.length][sum] ;
        
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