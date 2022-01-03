class Solution {
    public boolean canJump(int[] nums) {
        int maxi = 0;
    for (int i = 0; i <= maxi; i++){
        maxi = Math.max(maxi, nums[i] + i);
        if (maxi >= nums.length-1) {
            return true;
        }
    }
    return false;
}
}