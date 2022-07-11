class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum=0;
        
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        int suml=0;
        
        for(int i=0;i<nums.length;i++){
            
            if (suml == sum - suml - nums[i]) 
                return i;
            suml += nums[i];
            
        }
        
        return -1;
    }
}