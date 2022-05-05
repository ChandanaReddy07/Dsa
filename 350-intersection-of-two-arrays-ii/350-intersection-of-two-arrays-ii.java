class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
         HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i]))
            {
                hm.put(nums1[i],hm.get(nums1[i])+1);
            }
            else
                hm.put(nums1[i],1);
        }
        
        ArrayList<Integer> l=new ArrayList<>(); 
        
        for(int i=0;i<nums2.length;i++)
        {
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>0)
            {
                l.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
                    
            }
        }
        
        
        int [] result=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            result[i]=l.get(i);
        }
        
        return result;
    
    }
}