class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
         int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        
        
        String str = "";
        int row = m;
        int col = n;
        while (row != 0 && col != 0) {
            if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
                str = str1.charAt(row - 1) + str;
                row--;
                col--;
            } else if (dp[row - 1][col] > dp[row][col - 1]) {
                str = str1.charAt(row - 1) + str;
                row--;
            } else {
                str = str2.charAt(col - 1) + str;
                col--;
            }
        }
        while (row != 0) {
            str = str1.charAt(row - 1) + str;
            row--;
        }
        while (col != 0) {
            str = str2.charAt(col - 1) + str;
            col--;
        }
        return str;
          
    }
}