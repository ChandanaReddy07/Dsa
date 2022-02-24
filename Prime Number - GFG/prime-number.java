// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}// } Driver Code Ends


class Solution{
    static int isPrime(int n){
        // code here
        
        if (n <= 1)  return 0;

    // Check from 2 to sqrt of n
    for (int i=2; i<=Math.sqrt(n); i++)
        if (n%i == 0)
            return 0;

    
    
    return 1;
}
   
}