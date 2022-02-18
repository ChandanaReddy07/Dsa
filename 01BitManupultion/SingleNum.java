//https://leetcode.com/problems/single-number-iii/

class Solution {
    public int[] singleNumber(int[] nums) {
        int two=0;
  
    for(int i=0;i<nums.length;i++)
    {
        two=two^nums[i];
    }
      
    int num1=0,num2=0;
    int mask= two&(~two+1);
    
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]&mask)!=0)
            {
                num1=num1^nums[i];
            }
            else
            {
                num2=num2^nums[i];
            }
        }
          
    int[] arr={num1,num2};
    return arr;
}
        
    }
