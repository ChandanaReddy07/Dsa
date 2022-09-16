class Solution {
    public boolean validPalindrome(String s) {
        
        int n =s.length();
        int i=0,j=n-1;
        while(i<j)
        {
            if (s.charAt(i)!=s.charAt(j))
            {
             return is_pal(s.substring(i+1,j+1)) || 
            is_pal(s.substring(i,j));
            }
            i++;
            j--;
        }
            return true;    
    }
    
    boolean is_pal(String s) 
    {
        int n = s.length();
        for (int i=0 ; i<n/2 ; i++)
        {
            if (s.charAt(i)!=s.charAt(n-1-i))
                return false;
        }
        
        return true;
    }
    

}