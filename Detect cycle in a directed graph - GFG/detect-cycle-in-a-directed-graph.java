// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    // public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
    //     // code here
    // }
     private boolean checkForCycle(int i, boolean[] visited,ArrayList<ArrayList<Integer>> adj,
                                      boolean[] recStack)
    {
    
        if (recStack[i])
            return true;
 
        if (visited[i])
            return false;
             
        visited[i] = true;
 
        recStack[i] = true;
        List<Integer> children = adj.get(i);
         
        for (Integer c: children)
            if (checkForCycle(c, visited,adj, recStack))
                return true;
                 
        recStack[i] = false;
 
        return false;
    }
 
   
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[V];
        boolean[] recStack = new boolean[V];
         
         for(int i = 0;i<V;i++) {
            if(vis[i] == false) {
                if(checkForCycle(i, vis, adj,recStack))
                    return true; 
            }
        }
        
        return false; 
    }
 
}