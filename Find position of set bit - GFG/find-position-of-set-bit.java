// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int n) {
        // code here
    
        int count = 1;
        int ck = -1;
        int num=1;
        while (n > 0) {
            count = n & 1;
            
            if(count==1){
                if(ck!=-1){
                    return -1;
                }
                ck=num;
            }
            
            n >>= 1;
            num++;
        }
        return ck;
    }
};