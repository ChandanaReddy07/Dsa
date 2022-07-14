class Solution {
    public int maxProfit(int[] arr) {
        
        if(arr.length==1){
            return 0;
        }
        
        int min=arr[0];
        
        int profit=0;
        
        int max=min;
        
        for(int i=1; i<arr.length; i++){
             
            if(max < arr[i])
            {
                max=arr[i];
            }
            if(arr[i] < max || i == arr.length - 1 ){
                
                profit+=max-min;     
                min=arr[i];
                max=arr[i];
               
            }    
             if(min>arr[i])
            {
                min=arr[i];
            }
            
        }
        return profit;     
    }
}