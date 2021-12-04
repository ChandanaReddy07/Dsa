class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;
        
        while (right < s.length()){
            
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                maxLen = Math.max(maxLen, right -left);
            }else
                set.remove(s.charAt(left++));
        }
        return maxLen;
  
    }
}