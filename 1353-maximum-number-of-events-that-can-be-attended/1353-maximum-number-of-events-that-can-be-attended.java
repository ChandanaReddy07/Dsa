class Solution {
    public int maxEvents(int[][] events) {
         Arrays.sort(events , (obj1,obj2) -> {
            if(obj1[1] == obj2[1]){
                return new Integer(obj1[0]).compareTo(obj2[0]);
            }
            return new Integer(obj1[1]).compareTo(obj2[1]);
        } );
        
        // N Log N
        TreeSet<Integer> daysPool = new TreeSet<>();
        for(int i=1 ; i <= 100000; i++ ){
            daysPool.add(i);
        }
        int count =0;
        
        // O N
        for(int event[] : events){
            int startDay = event[0];
            int endDay = event[1];
            // O(LogN)
            Integer lower = daysPool.ceiling(startDay);
            if(lower == null || lower > endDay){
                continue;
            }
            // LOG N
            daysPool.remove(lower);
            count++;
        }
        return count;
    }
}