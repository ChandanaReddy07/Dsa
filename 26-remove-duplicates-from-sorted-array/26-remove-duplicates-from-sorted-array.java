class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int count=0;
        int i=0,j=0;
        // int comp=arr[0];
       while(i<nums.length-1 && j<nums.length ){
           
           if(nums[i]!=nums[j]){
               nums[i+1]=nums[j];
               i++;
               j++;
               count++;
           }
           else{
               j++;
           }
            
       }
        
        return ++count;
        
        
    }
}