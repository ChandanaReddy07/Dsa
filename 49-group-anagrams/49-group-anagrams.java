import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i< strs.length;i++){
            System.out.println(strs[i]);
            char arr[] = strs[i].toCharArray();
             
            Arrays.sort(arr);
            
            String s = new String(arr);
            
              System.out.println(s);
           
            
            if(!map.containsKey(s))
                
                map.put(s, new ArrayList<>());
            
            
                
                map.get(s).add(strs[i]); 
            
        }
        
        List<List<String>> res= new ArrayList<>();
        
      Collection<List<String>> values = map.values();
       
      for (List<String> v : values) {
         res.add(v);
       }
        return res;
       
    }
}
