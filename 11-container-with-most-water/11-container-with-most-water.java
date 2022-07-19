class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length-1;
        
        int l=0,r=n;
        
        
        int current=0,max=0;
        
        while(l<r){
            
            current = Math.min(height[l],height[r]) * (r-l);
            
            
            if(max < current){
                
                max= current;
            }
            
            
             if(height[l]>height[r]){
                r--;
            }
            else if(height[l]<height[r])
                l++;
            
            else
            {r--;l++;}
            
        }
        
        return max;
        
    }
}