// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        // Write your code here.
      PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return   a[1]-b[1];
            } else {
                return a[0]-  b[0];
            }
        });
        
        for(int i = 0; i < k; i++){
            pq.add(new int[]{arr[i][0],i,0});
        }
        
        
        ArrayList<Integer> res=new  ArrayList<Integer>(k*k);
        
        while(pq.size() !=0){
            int[] curr = pq.poll();
            
            res.add(curr[0]);
            int index = curr[1];
            int tr = curr[2];
            
            if(tr+1 < k){
                pq.add(new int[]{arr[index][tr+1] , index , tr+1});
            }
        }
        
        return res;
        
        
    }
    
}