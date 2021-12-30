
class Solution{
     static int[][] dp=new int[501][501];
    static int palindromicPartition(String str)
    {
        // code here
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
          return minPalPartion(str,0,str.length()-1);
    }
    
      static boolean isPalindrome(String string, int i, int j)
  {
    while(i < j)
    {
      if(string.charAt(i) != string.charAt(j))
        return false; 
      i++;
      j--;
    }
    return true;
  }
 
  static int minPalPartion(String string, int i, int j)
  {   
    if( i >= j || isPalindrome(string, i, j) )
      return 0;
      
      if(dp[i][j]!=-1){
          return dp[i][j];
      }
      
     dp[i][j] = Integer.MAX_VALUE;
    for(int k = i; k < j; k++)
    {
     int count = minPalPartion(string, i, k) +
        minPalPartion(string, k + 1, j) + 1;
 
      dp[i][j]= Math.min(dp[i][j], count);
    }
    return dp[i][j];
  }
}
