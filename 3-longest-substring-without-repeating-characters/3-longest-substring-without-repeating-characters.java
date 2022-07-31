class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        List<Character> l = new ArrayList<>();
        char c;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(l.contains(c))
            {
                max = Math.max(max,l.size());
                while(l.get(0) != c)
                    l.remove(0);
                l.remove(0);
            }
            l.add(c);
        }
        return Math.max(max,l.size());
    }
}