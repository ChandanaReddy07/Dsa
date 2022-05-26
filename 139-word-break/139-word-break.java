class Solution {
    
        Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
      dp = new Boolean[s.length()+1];
      return dfs(0, s, wordDict);
    
    }
  
    public boolean dfs(int j, String s, List<String> wordDict){
        
       if(s.length()==0) return true;
           
       if(dp[j]!=null)return dp[j];
        for(int i=0;i<wordDict.size();i++){
            String k = wordDict.get(i);
            int len = k.length();
          
            if(s.length()>=len && k.equals(s.substring(0, len))){
              if(dfs(j+len, s.substring(len),wordDict)){
                return dp[j]=true;
              }
            }
        }
        return dp[j]=false;
    
    }
}