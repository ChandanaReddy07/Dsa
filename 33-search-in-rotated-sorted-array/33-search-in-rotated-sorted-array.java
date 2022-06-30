class Solution {
     
  public int search(int[] nums, int target) {
      
// 		int start = 0;
// 		int end = nums.length - 1;
// 		while (start <= end){
// 			int mid = (start + end) / 2;
// 			if (nums[mid] == target) return mid;

// 			if (nums[start] <= nums[mid]){
// 				 if (target < nums[mid] && target >= nums[start]) 
// 					end = mid - 1;
				
//                 else
// 					start = mid + 1;
// 			} 

// 		 else if (nums[mid] <= nums[end]){
// 				if (target > nums[mid] && target <= nums[end])
// 					start = mid + 1;
// 				 else
// 					end = mid - 1;
// 			}
// 		}
// 		return -1;
      
      return helper(nums,0,nums.length-1,target);
	
    }
    
    
    public int helper(int[] nums,int start,int last,int target){
        
        
        if(start>last){
            return -1;
        }
        
          int mid=(start+last)/2;
        
        if (nums[mid] == target) return mid;
        
      
        
        if(nums[start] <= nums[mid] && target < nums[mid] && target >= nums[start]){
            
            return helper(nums,start,mid-1,target);
                 
        }
      
        
        if(nums[mid] <= nums[last] && target > nums[mid] && target <= nums[last]){
            return helper(nums,mid+1,last,target);
        }
        
        
        if (nums[start] <= nums[mid]){
            return helper(nums,mid+1,last,target);
        }
        
        else if(nums[mid] <= nums[last]){
            return helper(nums,start,mid-1,target);
        }
        
        return -1;
        
        
        
        
        
    }
  
    
}