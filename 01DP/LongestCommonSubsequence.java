class Solution
{
      // static int[][] t= new int[1001][1001];
       
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
         int[][] t= new int[x+1][y+1];
          for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++){
                if(i==0 || j==0)
                  t[i][j]=0;
        }
        }
        
          for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                  t[i][j]=1+ t[i-1][j-1];
               else
                 t[i][j] = Math.max( t[i-1][j] , t[i][j-1]);
        
        }
        }
       
        return t[x][y];
       
    }
    // static int ll(int x,int y,String s1,String s2){
    //       if(x==0 || y==0){
    //         return 0;
    //     }
    //     if(t[x][y]!=-1){
    //         return t[x][y];
    //     }
        
    //     if(s1.charAt(x-1)==s2.charAt(y-1))
    //     t[x][y]=1+lcs( x-1, y-1,  s1,  s2);
        
    //     else
    //      t[x][y] = Math.max(lcs( x-1, y,  s1,  s2) ,lcs( x, y-1,  s1,  s2));
        
        
    //     return t[x][y];
    // }
    
}