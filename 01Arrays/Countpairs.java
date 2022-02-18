
class Solution {
    int getPairsCount(int[] arr, int n, int sum) {
        // code here
    HashMap<Integer, Integer> freq = new HashMap<>();
    
     int count = 0;
 
        for (int i = 0; i < n; i++) {
 
            if (!freq.containsKey(arr[i]))
            {
                  freq.put(arr[i], 0);
            }
                
             freq.put(arr[i], freq.get(arr[i]) + 1);
        }
       

        for (int i = 0; i < n; i++) {
            
            int remain=sum - arr[i];
            
            if (freq.get(remain) != null){
                  count += freq.get(remain);
            }
            
            if(sum-arr[i]==arr[i]){
                count--;
            }
        }
        return count / 2;
    }
}
