class Solution {
    public int[] decode(int[] encoded, int first) {
        
        // a ^ x = b
        // a = b ^ x
     
        int arr[] = new int[encoded.length+1];
        arr[0] = first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1] = arr[i]^encoded[i];
        }
        return arr;
 
    }
}