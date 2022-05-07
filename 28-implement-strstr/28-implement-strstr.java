class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            for( j=0;j<needle.length();j++){
                if(!(haystack.charAt(i+j)==needle.charAt(j))){
                    break;
                }
            }       
                   if(j==needle.length()){
                       return i;
                   }
            }                  
                   return -1;        
    }
}