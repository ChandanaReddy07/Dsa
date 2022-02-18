public class Solution {
    public int solve(int[] A, int B) {
        int l = 0;
        int h = 0;
        int ans = 0;
        long minDiff = Integer.MAX_VALUE;

        for (int i : A) {
            h = Math.max(i, h);
        }

        while (l <= h) {
            int m = (l + h) / 2;

            long C = 0;

            for (int i : A) {
                if (i >= m) {
                    C += (i - m);
                }
            }

            int a=0,b=A.length-1;

            while(a<b){

                int mid1=(a+b)/2;

                 if (C >= D) {
                l = m + 1;
            } else if (C < D) {
                h = m - 1;
            }
            }

            long D = (long) B;

            if (C >= D) {

                if (C - D < minDiff) {
                    ans = m;
                    minDiff = C - D;
                }

                l = m + 1;
            } else if (C < D) {
                h = m - 1;
            }
        }

        return ans;
    }
}
