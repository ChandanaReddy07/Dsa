// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
    
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public String excelColumn(int n){
        
        //  Your code here
      
               StringBuilder str = new StringBuilder();

        
        while(n>0 ){
            int rem=n%26;
            
            if(rem==0){
                str.append("Z");
                n=(n/26)-1;
            }
            else{
                 str.append((char)((rem - 1) + 'A'));
                n = n / 26;
            }
        }
        
          str.reverse();
        
        return str.toString();
        
        
    }
}