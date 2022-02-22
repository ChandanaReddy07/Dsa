// { Driver Code Starts
import java.util.*;
import java.math.*;

class Pair{
    
    int x,y;
    Pair(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            int m = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());
            char mat[][] = new char[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j] = sc.next().charAt(0);
                }
            }
           
            Solution T = new Solution();
            int ans[][] = T.findDistance(mat, m, n);
            
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    
    public static int[][] findDistance(char mat[][], int m,int n)
    {
        // Your code goes here
          int[][] res = new int[m][n];
          
        for(int[] r : res){
            Arrays.fill(r, -1);
        }
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 'B'){
                    queue.add(new int[]{i, j, 0});
                    res[i][j] = 0;
                }
            }
        }
        
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
      while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int currDist = curr[2];
            for(int i = 0; i < 4; i++){
                int newX = dx[i] + x, newY = dy[i] + y, newDist = currDist + 1;
                if(newX < 0 || newY < 0 || newX >= m || newY >= n || mat[newX][newY] != 'O' || res[newX][newY] != -1){
                    continue;
                }
                res[newX][newY] = newDist;
                queue.add(new int[]{newX, newY, newDist});
            }
            
        }
        return res;
    }
}