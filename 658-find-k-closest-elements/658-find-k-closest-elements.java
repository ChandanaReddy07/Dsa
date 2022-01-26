//import javafx.util.Pair;
class Solution {
   
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<int[]> p = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return b[0] - a[0];
            }
        });
        
        for(int i=0;i<arr.length;i++) { // n
            p.add(new int[]{Math.abs(x-arr[i]), arr[i]}); // log k
            
            if(p.size() > k) {
                p.poll();
            }
        }
     
       
        List<Integer> ans = new ArrayList<>(k);
        
         for(int i = 0 ; i < k ; i++){
           ans.add(p.poll()[1]);
        }
        
        Collections.sort(ans); 
  
        
        return ans;
    }
}