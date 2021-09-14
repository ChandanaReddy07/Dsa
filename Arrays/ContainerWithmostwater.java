class Solution {
    public int maxArea(int[] arr) {
   
        int n=arr.length;
           int li=0,ri=n-1,sum=0;  
        
        for(int i=0;i<n;i++){
            
            if(sum<Math.min(arr[li],arr[ri])*(ri-li))
                   sum= Math.min(arr[li],arr[ri])*(ri-li);
            
            if(arr[li]<arr[ri]){
                
                li++;
                
            }
            else if(arr[li]>arr[ri]){
                ri--;
            }
            else{
                 
                li++;
                ri--;
                
            }
       
        } 
        return sum;  
        
    }
}
