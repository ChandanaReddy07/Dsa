class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
                Arrays.sort(nums);
        List<List<Integer>> fk = new ArrayList<>();
    for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            int str=target-(nums[i]+nums[j]);
            int st=j+1;
            int ed=nums.length-1;
            while(st<ed){
                if(nums[st]+nums[ed]==str){
                fk.add(Arrays.asList(nums[i], nums[j], nums[st], nums[ed]));
                    while(st<ed&&nums[st]==nums[st+1])st++;
                    while(st<ed&&nums[ed]==nums[ed-1])ed--;
                    st++;
                    ed--;
                }
                else if(nums[st]+nums[ed]<str)st++;
                else ed--;
            }
        while(j+1<nums.length&&nums[j+1]==nums[j])++j;    
        }
        while(i+1<nums.length&&nums[i+1]==nums[i])++i;
    }
        return fk;
    
    }
}