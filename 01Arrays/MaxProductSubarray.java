class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
    //       int global_sum=arr[0],current_max=arr[0],current_min=arr[0];
           
    //       for(int i=1;i<n;i++){
    //           if (arr[i] < 0){
    //               int temp=current_max;
    //               current_max=current_min;
    //               current_min=temp;
    //           }
            
    //   current_max = Math.max(arr[i], current_max* arr[i]);
    //     current_min = Math.min(arr[i], current_min * arr[i]);

    //         global_sum=Math.max(current_max, global_sum);
             
    //       }
    //       return global_sum;
     long minVal = arr[0];
    long maxVal = arr[0];

    long maxProduct = arr[0];

    for (int i = 1; i < n; i++) {

            if (arr[i] < 0)
            {
                long temp = maxVal;
                maxVal = minVal;
                minVal =temp;
            }

         maxVal = Math.max(arr[i], maxVal * arr[i]);
         minVal = Math.min(arr[i], minVal * arr[i]);
    
         maxProduct = Math.max(maxProduct, maxVal);
    }
         return maxProduct;
    }
}