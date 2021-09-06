//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
            java.util.Arrays.sort(arr);
   // final int n = arr.length;
    int result = arr[n - 1] - arr[0];
    for (int i = 1; i < n; ++i) {
        final int min = Math.min(arr[0] + k, arr[i] - k);
        final int max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
         if(min < 0) continue;
        result = Math.min(result, max - min);
    }
    return result;
    
    }
}
