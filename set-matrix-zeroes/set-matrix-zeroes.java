class Solution {
    public void setZeroes(int[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;
    Set<Integer> r= new HashSet<Integer>();
    Set<Integer> c= new HashSet<Integer>();

    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (matrix[i][j] == 0) {
          r.add(i);
          c.add(j);
        }
      }
    }

    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (r.contains(i) || c.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}