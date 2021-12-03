class Solution {
     
    public void swap(int[] arr,int i,int c){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
        
        
    }
    public int firstMissingPositive(int[] nums) {
      //cyclic sort
        int i=0;
        
        while(i<nums.length){
            
            int c=nums[i]-1;
            
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[c]){
                
                swap(nums,i,c);    
            }
            else{
                i++;
            }
        }
       
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        
        return nums.length+1;
        
        
    }
}