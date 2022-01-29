class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] res=new int[k][2];
        
        int n=points.length;
        
        //min heap
        PriorityQueue<int[]> p = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return   b[1]-a[1];
            } else {
                return b[0]-  a[0];
            }
        });
        
        for (int i = 0; i < n; i++) {
            int dist=(points[i][0]*points[i][0]) + (points[i][1]*points[i][1]);
            int[] entry = {dist, i};
            if (p.size() < k) {
                
                p.add(entry);
            } else if (entry[0] < p.peek()[0]) {
                p.poll();
                p.add(entry);
            }
        }
        
         for (int i = 0; i < k; i++) {
            int entryIndex = p.poll()[1];
            res[i] = points[entryIndex];
        }
       
        return res;
   
    }
}