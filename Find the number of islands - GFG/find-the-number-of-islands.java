// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    
    public void DFS(char[][] M, int i, int j, int ROW, int COL)
    {
        if (i < 0 || j < 0 || i > (ROW - 1) || j > (COL - 1) || M[i][j] != '1')
        {
            return;
        }
  
       if (M[i][j] == '1')
                {
                    M[i][j] = '0';
            DFS(M, i + 1, j, ROW, COL);     //right side traversal
            DFS(M, i - 1, j, ROW, COL);     //left side traversal
            DFS(M, i, j + 1, ROW, COL);     //upward side traversal
            DFS(M, i, j - 1, ROW, COL);     //downward side traversal
            DFS(M, i + 1, j + 1, ROW, COL); //upward-right side traversal
            DFS(M, i - 1, j - 1, ROW, COL); //downward-left side traversal
            DFS(M, i + 1, j - 1, ROW, COL); //downward-right side traversal
            DFS(M, i - 1, j + 1, ROW, COL); //upward-left side traversal
        }
    }
  
    public int numIslands(char[][] M)
    {
        int ROW = M.length;
        int COL = M[0].length;
        int count = 0;
        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                if (M[i][j] == '1')
                {
                    M[i][j] = '0';
                    count++;
                    DFS(M, i + 1, j, ROW, COL);     //right side traversal
                    DFS(M, i - 1, j, ROW, COL);     //left side traversal
                    DFS(M, i, j + 1, ROW, COL);     //upward side traversal
                    DFS(M, i, j - 1, ROW, COL);     //downward side traversal
                    DFS(M, i + 1, j + 1, ROW, COL); //upward-right side traversal
                    DFS(M, i - 1, j - 1, ROW, COL); //downward-left side traversal
                    DFS(M, i + 1, j - 1, ROW, COL); //downward-right side traversal
                    DFS(M, i - 1, j + 1, ROW, COL); //upward-left side traversal
                }
            }
        }
        return count;
    }
}