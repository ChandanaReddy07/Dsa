class Solution {
    public int countConsistentStrings(String s, String[] words) {
        
        
        int mask=0;
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            mask = mask | 1<<(s.charAt(i)-'a');
        }
        
        int ans=0;
        
        for(String x : words){
            
            int c=0;
            
            for(char ci: x.toCharArray()){
                if((mask & (1<< (ci-'a')))!=0)
                    c++;
                else
                    break;
            }
            if(c==x.length())
                ans++;     
        }
        
   return ans;
        
    }
}
