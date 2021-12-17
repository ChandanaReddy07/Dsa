class Solution{
    int longestCommonSubstr(String s1, String s2, int x, int y){
        // code here
        
        
         int[][] t= new int[x+1][y+1];
          for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++){
                if(i==0 || j==0)
                  t[i][j]=0;
        }
        }
        int max=0;
        
          for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                  {t[i][j]=1+ t[i-1][j-1];
                  max=max<t[i][j]?t[i][j]:max;}
               else
                 t[i][j] =0;
        
        }
        }
       
        return max>t[x][y]?max:t[x][y];
        
        
        
    }
}