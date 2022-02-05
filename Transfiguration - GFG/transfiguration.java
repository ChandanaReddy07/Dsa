// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
    	// Your code goes here.
    	 if(A.length() != B.length())
            return -1;
         
        int i, j, res = 0;
        int count [] = new int [256];//count frequency
         
       
        for(i = 0; i < A.length(); i++)
        {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }
         
      
        for(i = 0; i < 256; i++)
            if(count[i] != 0)
                return -1;
         
        i = A.length() - 1;
        j = B.length() - 1;
 
        while(i >= 0)
        {
            
            if(A.charAt(i) != B.charAt(j))
                res++;
            else
                j--;
            i--;        
        }
        return res;   
    }
}