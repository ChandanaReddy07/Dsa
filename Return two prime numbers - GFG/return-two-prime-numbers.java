// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static void sieveOfEratosthenes(int n,boolean prime[])
    {
        
        
        for (int i = 0; i <= n; i++)
            prime[i] = true;
            
        // prime[0] = prime[1] = false;
 
        for (int p = 2; p * p <= n; p++)
        {
            if (prime[p] == true)
            {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }
     
    static List<Integer> primeDivision(int N){
        // code here
          boolean prime[] = new boolean[N + 1];
        
           List<Integer> ls= new LinkedList<>();
          
          sieveOfEratosthenes(N,prime);
          
          for(int i=2 ; i<N ; i++){
              
              if(prime[i] && prime[N-i]){
                  ls.add(i);
                  ls.add(N-i);
              }
          }
           return ls;
    }
}