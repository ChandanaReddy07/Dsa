class Solution {
    //cyclic sort
     public void swap(int[] arr,int i,int c){
        
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
  
    public int findDuplicate(int[] nums) {
         int i=0;
        
        while(i<nums.length){
            
            if(nums[i]!=i+1){
                  int c=nums[i]-1;
            
            if(nums[i]!=nums[c]){
                
                swap(nums,i,c);    
            }
            else{
                return nums[i];
            }
            }
            else
                i++;
        }
        
        return 0;
        
    }
}