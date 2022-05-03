class Solution {
    public int[] plusOne(int[] digits) {
   int i=digits.length-1;
        int carry=1;
        while(i>=0 && carry>0){
                digits[i]=carry+(digits[i]);
                carry=digits[i]/10;
            if(digits[i]==10){
                digits[i]=0;
            }
            i--;
        }
        if(carry>0){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}