class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pl=new ArrayList<>();
        List<Integer> cl=new ArrayList<>();
        cl.add(1);
        pl.add(cl);
        if(numRows==1){
            return pl;
        }
         cl=new ArrayList<>();
        cl.add(1);
        cl.add(1);
        pl.add(cl);
        if(numRows==2){
            return pl;
        }
        // System.out.println(pl);
        for(int i=2;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;j++){
                l.add(pl.get(i-1).get(j-1)+pl.get(i-1).get(j));
            }
            l.add(1);
            pl.add(l);
        }
        return pl;   
    }
}