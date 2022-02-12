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
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            int[] start = new int[N];
            int[] end = new int[N];
            
            for(int i=0; i<N; i++)
            {
                start[i] = Integer.parseInt(S1[i]);
                end[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxEvents(start,end,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
        // code here
        // PriorityQueue<int[]> hp=new PriorityQueue<int[]>((a,b)->{
        //     if(a[1]==b[1]){
        //         return  a[0]-b[0] ;
        //     }
        //     else{
              
        //          return a[1]-b[1];
        //     }
        // });
        
        // for(int i=0;i<N;i++){
        //     int[] x={start[i],end[i]};
        //     hp.add(x);
        // }
        
        // int count=0;
   
        
        //  TreeSet <Integer> set=new TreeSet<Integer>();
        //     for(int i=0;i<10000;i++){
        //         set.add(i);
        //     }
            
         int a[][]=new int[N][2];
        for(int i=0;i<N;i++)
        {
            a[i][0]=start[i];
            a[i][1]=end[i];
        }
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i<=100000;i++)
        set.add(i);
        int ans=0;
        Arrays.sort(a,new MIN());
        // Arrays.sort(a,Comparator.<int[]>comparingInt(p->p[1]).thenComparingInt(p->p[0]));
        
              for(int i=0;i<N;i++)
        {
            Integer available=set.ceiling(a[i][0]);
            if(available==null || available>a[i][1])
            continue;
            else
            {
                ans++;
                set.remove(available);
            }
        }
        return ans;
    }
    static class MIN implements Comparator<int[]>
    {
        public int compare(int a[],int b[])
        {
            if(a[1]>b[1]) return 1;
            else if(a[1]<b[1]) return -1;
            else if(a[0]>b[0]) return 1;
            else if(a[0]<b[0]) return -1;
            else return 0;
        }
    }
};