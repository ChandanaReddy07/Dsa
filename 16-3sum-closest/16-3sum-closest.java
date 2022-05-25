class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        
      
        int min=Integer.MAX_VALUE;
        int res=0;
        
        for(int i=0;i<nums.length-2;i++) {
            
        if(i==0|| (i>0 && nums[i]!=nums[i-1]))
           {int low=i+1;
           int high=nums.length-1;
           int sum=target-nums[i]; 
                  
           while(low<high){
              
               if(Math.abs(sum-(nums[low]+nums[high]))<min)
               {
                   min=Math.abs(sum-(nums[low]+nums[high]));
                   res=nums[i]+nums[low]+nums[high];
               }
              
               
               if(nums[low]+nums[high]==sum){
                   
                 return target;
               }
                   
            else if(nums[low]+nums[high]>sum){
                         high--;     
               }
               else{
                   low++;
               }
                   
           }
           }
        }
        return res;
        
    }
}