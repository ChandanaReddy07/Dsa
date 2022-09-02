class TimeMap {
    
     class Pair{
         
         int timestamp;
         String value;
         
         Pair(String value,int timeStamp){
             this.value = value;
             this.timestamp=timeStamp;
         }
     }
         
          
    Map<String, ArrayList<Pair>> map;
         
         
     TimeMap() {
        map = new HashMap<>();
    }
         
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
             }
        map.get(key).add(new Pair(value, timestamp));
    }
         
     
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        return search(map.get(key), timestamp);
    }
         
   String search(ArrayList<Pair> list,int currenttime){
       
       int left = 0, right = list.size() - 1;
        String res = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int time = list.get(mid).timestamp;
            if (time <= currenttime) {
                res = list.get(mid).value;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
       
        return res;
       
   }
         
         
     
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */