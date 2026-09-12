class Solution {
    public int longestOnes(int[] nums, int k) {
        int best = 0;
        int a = 0;
        int count0 = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count0++;
            }

            while (count0 > k) {
                if (nums[left] == 0) {
                    count0--;
                }
                left++;
            }

            a = i - left + 1;
            best = Math.max(best, a);
        }

        return best;
    }
}