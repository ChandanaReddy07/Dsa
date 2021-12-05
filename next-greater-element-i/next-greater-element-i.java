class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
       
        
        int[] x=new int[nums1.length];
        
        Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums2.length;i++){
            mp.put(nums2[i],i);
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=nums2.length-1;i>=0;i--){
            
            int y=  nums2[i];
            if(i==nums2.length-1){
            
                 nums2[i]=-1;
                 
               // continue;
                 
            }
            else if(stack.size()!=0 && nums2[i]<stack.peek()){
                nums2[i]=stack.peek();
            }
            else if(stack.size()!=0 && nums2[i]>stack.peek()){
                while(stack.size()!=0 && nums2[i]>stack.peek())
                    stack.pop();
                
                if(stack.size()==0)
                {
                nums2[i]=-1;
               // System.out.println("lolo"+i);
                }
                
                else 
                    nums2[i]=stack.peek();
            
        }
            
            stack.push(y);
        }
        
       for(int i=0;i<nums1.length;i++){
           
         nums1[i]=nums2[mp.get(nums1[i])];
           
       }
     
          return nums1;
        
    }
        
    
}