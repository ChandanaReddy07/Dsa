class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zero=-1;
        boolean multipleZero= false;
        for(int i=0;i<nums.length;++i)
        {
            if(nums[i]==0 && zero==-1)
                zero=i;
            else if(nums[i]==0 && zero!=-1)
                multipleZero=true;
            else
            product*=nums[i];
        }
        
        
       if(zero!=-1)
        {
                    
            for(int i=0;i<nums.length;++i)
            {
                if(nums[i]!=0 || multipleZero)
                    nums[i]=0;
                else
                    nums[i]=product;
            }
           return nums;
        }
        
        for(int i=0;i<nums.length;++i)
                    nums[i]=product/nums[i];
                 
        return nums;
        
    }
}