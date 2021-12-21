class Solution {
    public int minInsertions(String s1) {
         StringBuilder s2 = new StringBuilder();
 
        s2.append(s1);
 
    
        s2.reverse();
        
        int x=s1.length(),y=s2.length();
        
          int[][] t= new int[x+1][y+1];
          for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++){
                if(i==0 || j==0)
                  t[i][j]=0;
        }
        }
        int k=0;
          for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    t[i][j]=1+ t[i-1][j-1];
                    k= i;
                }
               else
                 t[i][j] = Math.max( t[i-1][j] , t[i][j-1]);
        }
        }
        //System.out.println("ha"+k);
        k--;
        int l=x-t[x][y];
        
        if(k==x){
            return  t[x][y]%2==0?l-1:l;
        }
       
        return l;
    }
}