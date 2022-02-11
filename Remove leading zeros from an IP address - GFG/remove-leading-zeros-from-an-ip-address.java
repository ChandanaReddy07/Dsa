// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String S)
    {
        // your code here
        
        int s=1;
        
        String res="";
        
        for(int i=0;i<S.length();i++){
            
            if(s==1){
                   if(i==S.length()-1 || S.charAt(i+1)=='.' || S.charAt(i)!='0'){
                       res=res+S.charAt(i);
                       s=0;
                   }
             
            }
            else{
               if(S.charAt(i)=='.'){
                s=1;
                }
                  res=res+S.charAt(i);
            }
          
        }
       return res;
    }
}