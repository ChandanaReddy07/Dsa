// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            
            for(int i=0; i<N-1; i++)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                String S[] = read.readLine().split(" ");
                temp.add(Integer.parseInt(S[0]));
                temp.add(Integer.parseInt(S[1]));
                arr.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxBinTreeGCD(arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        int max=0;
        arr.sort((a,b) -> a.get(0) - b.get(0));
        
         for(int i=1; i<arr.size(); i++){
            if(arr.get(i).get(0) == arr.get(i-1).get(0)){
                max= Math.max(max, gcd(arr.get(i).get(1), arr.get(i-1).get(1)));
            }
        }
        return max;
        
    }
    
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }
            else
            b-=a;
        }
        return a;
    }
};