class Solution {
    //ek tarika 
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
    //efficient 
  
    public int binaryGap(int N) {
        int last = -1, ans = 0;
        for (int i = 0; i < 32; i++)
            if (((N >> i) & 1) > 0) {
                if (last >= 0)
                    ans = Math.max(ans, i - last);
                last = i;
            }

        return ans;
    }

}