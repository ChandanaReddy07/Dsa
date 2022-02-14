class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        int even = (len%2==0) ? len/2 : len/2 + 1;
        int odd = len - even;
        int arrA[] = new int[odd];
        int arrB[] = new int[even];
        int index = 0;
        //Split num[] into 2 Arrays based on index
        for(int i=0; i<len; i++){
            if(i%2 == 0)
                arrB[index] = nums[i];
            else{
                arrA[index] = nums[i];
                index += 1;
            }
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        index = 0;
        //Rearrange the num[]
        for(int i = 0; i<nums.length; i++){
            nums[i] = (i%2==0) ? arrB[index] : arrA[odd-1];
            odd -= (i%2!=0) ? 1 : 0;
            index += (i%2==0) ? 1 : 0;
        }
        return nums;
    }
}