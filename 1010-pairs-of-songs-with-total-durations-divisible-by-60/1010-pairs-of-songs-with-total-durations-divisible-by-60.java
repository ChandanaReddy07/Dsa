class Solution {
 
    public int numPairsDivisibleBy60(int[] time) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < time.length; i++) {
            int mod=(time[i] % 60);
            int betterhalf = 60 - mod ;
            if(hm.containsKey(betterhalf)) {
                ans += hm.get(betterhalf);
            }
            
            if(mod!=0)
            hm.put(mod ,hm.getOrDefault(mod, 0) + 1);
            else{
                hm.put(60 ,hm.getOrDefault(60, 0) + 1);
            }
            
        }
        return ans;
    
}
}