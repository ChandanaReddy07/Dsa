class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ls= new ArrayList<List<Integer>>();
        int n=nums.length;
        
        for(int i=0;i<(1<<n);i++){
            //yo
            // i=0 to i=2^n
            
            List<Integer> lsa= new ArrayList<Integer>();
            
            for(int j=0;j<n;j++){
                
                //checling if the perticular bit set or not
                if((i&(1<<j))!=0) 
                    lsa.add(nums[j]);
            }
            ls.add(lsa);  
        }
        return ls;
        
    }
}