class Solution {
    public int[] frequencySort(int[] nums) {
         HashMap<Integer,Integer> hm = new HashMap<>();
    
	int c = 0; //for counting distinct values 
    for(int i=0;i<nums.length;i++){
        if(hm.containsKey(nums[i])){
            int v = hm.get(nums[i]);
            v++;
            hm.put(nums[i],v);
        }else{
            hm.put(nums[i],1);
            c++;
        }
    }
	    
	    //max heap algo
         PriorityQueue<int[]> p = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return   b[1]-a[1];
            } else {
                return  a[0] - b[0];
            }
        });
        
        for (Integer key : hm.keySet()) {          
        p.add(new int[]{hm.get(key), key}); // log k         
    }
        int j=0;
         for (int i=0;i<c;i++) {
             
             int val=p.poll()[1];
             int freq= hm.get(val);
             
              for (int k=0;k<freq;k++) {
                  
                  nums[j]=val;
                  j++;
       
         }
           
         }
            
           
    return nums;
    
    }
}
