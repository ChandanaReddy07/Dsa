class Solution {
    public int getMaximumGenerated(int n) {
        
//         if(n==0){
//             return 0;
//         }
        
//         int[] arr=new int[n+1];
//         arr[0]=0;
        
//         arr[1]=1;
//         int max=1;
        
//         for(int i=1;i<=n/2;i++){
//             arr[2 * i] =arr[i];
//             max=Math.max(max,arr[2 * i]);
            
//             if(2 * i+1<=n)
//             {arr[2 * i+1] =arr[i] + arr[i+1];
//              max=Math.max(max,  arr[2 * i+1]);
//             }
//         }
        
//         return max;
          if(n<2)
            return n;
        
       int[] nums=new int[n+1];
        nums[0] = 0;
        nums[1] = 1;

        int best = 1;
        for(int i = 2; i<=n;++i)
        {
            if(i%2==0)
                 nums[i] = nums[i/2];
            else
                nums[i] = nums[(i-1)/2] + nums[(i+1)/2];
            if(nums[i] > best)
                best = nums[i];
        }
        
        return best;
    
        
    }
}