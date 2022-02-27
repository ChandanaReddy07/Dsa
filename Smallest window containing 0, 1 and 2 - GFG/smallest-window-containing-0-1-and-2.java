// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    
    static int INT_MAX= Integer.MAX_VALUE;
    public int smallestSubstring(String S) {
        // Code here
        
        int[] arr={0,0,0};
        int ans = INT_MAX;
        int j=0;
        
        for(int i=0;i<S.length();i++){
            
            arr[S.charAt(i)-'0']++;
                
                while(j<i && arr[0]*arr[1]*arr[2]>0){
                    
                      ans = Math.min(ans, i - j + 1);
                      arr[S.charAt(j) - '0']--;
                      j++;
                
            }
        }
         return ans != INT_MAX ? ans : -1;
        }
};
