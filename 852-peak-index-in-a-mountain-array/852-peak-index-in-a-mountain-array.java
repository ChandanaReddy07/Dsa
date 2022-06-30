class Solution {
    public int peakIndexInMountainArray(int[] arr) {
  
        
        int i=0,j=arr.length-1,mid=-1;
         while(i<=j){
            
             mid=(i+j)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                break;
            }


            if(arr[mid]>arr[mid+1]){
                  j=mid-1;
                            
            }
            else if(arr[mid]<arr[mid+1]){
              
                i=mid+1;
            }
         }
           
          return mid;
         
    }
            
              
}