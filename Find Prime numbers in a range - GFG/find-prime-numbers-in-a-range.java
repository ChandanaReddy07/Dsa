// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> arr= new ArrayList<Integer>();
        boolean div=true;
         for(int j=M;j<=N;j++)
         {
              if (j == 1 || j == 0)
            continue;
            
            div=true;
               
               for(int i=2;i<=Math.sqrt(j);i++){
                   if (j % i == 0)
                       {div=false;
                       break;}
               }
            
            if(div)
            arr.add(j);
            
            
         }
       
        return arr;
    }
}