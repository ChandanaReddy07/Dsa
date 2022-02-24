class Solution {
    
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

                }
            }
        }
        return count;
    }
}