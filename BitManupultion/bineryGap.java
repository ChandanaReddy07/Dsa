class Solution {
    public int binaryGap(int N) {
        
      
            String temp = Integer.toBinaryString(N);
            int last = -1,count=0,ans=0;
            for(char j : temp.toCharArray())
            {
                if(j=='1'){
                    if(last==-1){
                        last=count;
                    }
                    else{
                        ans = Math.max(ans,count-last);
                        last =count;
                    }
                }
                count++;
            }
            
        return ans;
    }

    
}