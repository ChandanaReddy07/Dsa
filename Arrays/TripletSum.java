public class TripletSum {

    public static boolean find3Numbers(int nums[], int n, int X) {

        // Your code Here
        Arrays.sort(nums);

        List<List<Integer>> lst = new LinkedList();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = X - nums[i];

                while (low < high) {

                    if (nums[low] + nums[high] == sum) {

                        return true;

                    }

                    else if (nums[low] + nums[high] > sum) {
                        high--;

                    } else {
                        low++;
                    }

                }
            }
        }

        return false;

    }
}
