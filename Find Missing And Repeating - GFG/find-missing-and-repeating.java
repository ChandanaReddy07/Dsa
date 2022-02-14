// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int i=0;
        int[] res=new int[2];
        while(i<n){
            int temp=arr[i];
            
            if(i+1 != temp){
                if(arr[temp-1]==temp){
                  i++;
                }
                else{
                    arr[i]=arr[temp-1];
                    arr[temp-1]=temp;
                }
                
                
            }
            else
            {
            i++;
            }
        }
        for(i=0;i<n;i++){
            if(i+1!=arr[i]){
                res[0]=arr[i];
                res[1]=i+1;
            }
        }
        return res;
    }
}