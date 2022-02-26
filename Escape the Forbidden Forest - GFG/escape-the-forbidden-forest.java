// { Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            Sol obj = new Sol();
            System.out.println(obj.build_bridges(str1,str2));
        }
    }
}// } Driver Code Ends


class Sol
{
    public static int build_bridges(String s1, String s2)
    {
       // code here 
       int x=s1.length(),y=s2.length();
    
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
}