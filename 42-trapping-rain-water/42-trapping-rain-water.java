
  class Solution {
    
    public int trap(int[] height) {
        
        if(height.length<3){
            return 0;
        }
        
       int max = 0,max_ind=0;
        for(int i=0;i<height.length;i++){
            
            if(max<height[i]){
                max=height[i];
                max_ind=i;
            }       
        }
        int a=height[0],sum=0;
        
        for(int i=1;i<max_ind;i++){
            
          if(height[i]<a){
              
              sum+= Math.min(a,max)-height[i];
          }
            else{
                a=height[i];               
            }
        }
        a=height[height.length-1];
         for(int i=height.length-1;i>=max_ind;i--){
            
          if(height[i]<a){
              
              sum+= Math.min(a,max)-height[i];
          }
            else{
                a=height[i];               
            }
        }
        
        return sum;
        
        
        
    
}
}