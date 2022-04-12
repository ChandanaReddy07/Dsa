// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        
        Arrays.sort(a);
        int maxs=0;
        int maxel=a[0];
        int t=1;
        for(int i=1;i<size;i++){
            
            if(a[i-1]!=a[i]){
                if(maxs<t) {maxs=t; maxel=a[i-1];}
                t=1;
               // System.out.println("yeh"+maxs);
           }
            else{
                t++;
            }
        }
        
         if(maxs<t) { maxs=t; maxel=a[size-1];}
                     //    System.out.println("yeh"+maxs);
         if(maxs<=size/2 ){
             maxel=-1;
         }
        return maxel;
    }
}