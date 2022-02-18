class Solution {
    public char findTheDifference(String s, String t) {
        
      
        int xor=0;
  
          for(int j=0;j<s.length();j++){
                 
                   xor^=(int)(s.charAt(j));
               
            }
         for(int j=0;j<t.length();j++){
                  
                   xor^=(int)(t.charAt(j));
               
            }
      // xor = 101 not 4 ok
      // so char(xor)=e
    
       return (char)xor;

    }
}