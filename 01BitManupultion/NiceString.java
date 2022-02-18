class Solution {
    public String longestNiceSubstring(String s) {
        
        int n=s.length();
        
        int l=0,r=0;
        
        for(int i=0;i < n; i++)
        {
            int a=0,b=0;
            
            for(int j=i;j<n;j++){
                
                if(s.charAt(j)>='a' && s.charAt(j)<='z')
                    a= a|(1<< (s.charAt(j) - 'a'));
                else
                    b= b|(1 <<(s.charAt(j) - 'A'));
                if(a==b && (j-i)> (r-l)){
                    r=j;
                    l=i;
                }
            }
        }
        
       return (l==r) ? "" : s.substring(l,r+1);
    
    }
}