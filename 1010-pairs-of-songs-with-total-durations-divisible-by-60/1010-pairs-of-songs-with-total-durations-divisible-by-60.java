class Solution {

   
    public int numPairsDivisibleBy60(int[] time) {
        
  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int count = 0;
	
	for(int i=0; i<time.length; i++) {
		int mod = time[i] % 60;
		int target = 60 - mod;
		
		if(map.containsKey(target)) {
			count += map.get(target);
		}
		if(mod != 0) {
			map.put(mod, map.getOrDefault(mod, 0)+1);
		}
		else {
			map.put(60, map.getOrDefault(60, 0)+1);
		}
	}
	return count;
    
}
}