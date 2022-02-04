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
            
            String arr[] = read.readLine().split(" ");

            Solution ob = new Solution();
            String[] res = ob.findPrefixes(arr,N);
            
            for(int i=0; i<res.length; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {

    static String[] findPrefixes(String[] arr, int N) {
         int curr = 0;
        int length = 1;
        String[] str = new String[N];
        while (curr != N) {
            boolean check = false;
            String ans = arr[curr].substring(0 , length);
            for(int i = 0; i < N; i++) {
                if (ans.length() <= arr[i].length() && i != curr && ans.equals(arr[i].substring(0 , ans.length() ))) {
                    length++;
                    check = true;
                    break;
                }
            }
            if (!check) {
                str[curr] = ans;
                length = 1;
                curr++;
            }
        }
        return str;
    }
};