class Solution {

      Boolean[][] pal;
    private boolean isPalindrome(String s, int i, int j){
        if(pal[i][j]!=null){
            return pal[i][j];
        }
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                pal[i][j]=false;
                return false;
            }
            i++;
            j--;
        }
        pal[i][j]=true;
        return true;
    }
    
    private int mcm(String s, int i, int j,int[][] dp){
        if(i>=j){
            return 0;
        }
        if(isPalindrome(s,i,j)){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            // instead of recurring for both the halves, we will first check if the first half is 
            // palindrome then only we will recur for the next half
            // int temp=1+mcm(s,i,k,dp)+mcm(s,k+1,j,dp);
            
            if(isPalindrome(s,i,k)){
                int temp=1+mcm(s,k+1,j,dp);
                min=Math.min(min,temp);
            }
           
        }
        dp[i][j]=min;
        return min;
    }
    
    public int minCut(String s) {
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        pal=new Boolean[n+1][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return mcm(s,0,n-1,dp);
    }
}