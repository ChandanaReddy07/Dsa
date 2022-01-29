class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] res=new int[k][2];
        
        //create a map
        HashMap<Integer,Integer> hm= new HashMap<>();
        int n=points.length;
        
        for(int i=0;i<n;i++){
            
            int dist = (points[i][0]*points[i][0]) + (points[i][1]*points[i][1]);
            
            hm.put(i,dist);
            
        }
        
        PriorityQueue<int[]> p = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return   b[1]-a[1];
            } else {
                return a[0]-  b[0];
            }
        });
        
          for (Integer key : hm.keySet()) {          
        p.add(new int[]{hm.get(key), key});       
    }
        
         for (int i=0;i<k;i++) {
             
             // System.out.println(p.poll()[1]);
             int y=p.poll()[1];
                 // System.out.println(y);
             res[i][0]=points[y][0];
              res[i][1]=points[y][1];
   
         }
           // res[0][0]=-2;
           //    res[0][1]=2;
        
        return res;
   
    }
}