class Solution {
    public boolean validPalindrome(String s) {
        
         int t1=0, t2=-1;
        int n =s.length();
        for (int i=0 ; i<n/2 ; i++)
        {
            if (s.charAt(i)!=s.charAt(n-1-i))
            {
                t1 = i;
                t2 = n-1-i;
                break;
            }
        }
        
        if (t2 == -1)
            return true; 
        
     return is_pal(s.substring(0, t1) + s.substring(t1+1,n)) || 
            is_pal(s.substring(0, t2) + s.substring(t2+1,n));   
    
        
        
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