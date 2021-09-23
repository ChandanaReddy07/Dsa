
import java.io.*;
import java.util.*;
public class SMallestSubarray {

    public  int smallestSubWithSum(int arr[], int n, int x) {

        int curr_sum=0,end=0,start=0,minimums=n;
// 1, 4, 45, 6, 0, 19   ----     51
        while(end < n){

            //add more elements unless sum is less than x
            while(curr_sum <x && end<n){
                curr_sum+=arr[end++];
            }

            //updated the minimums length
            if(end-start<minimums){
                minimums=end-start;
            }

            //now decrement length from the rear end
            curr_sum-=arr[start++];

        }

        return minimums;

    }
}
