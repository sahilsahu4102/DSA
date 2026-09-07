class Solution {
    public void sortColors(int[] nums) {

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0) c0++;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 1) c1++;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2) c2++;

        Arrays.fill(nums, 0, c0, 0);
        Arrays.fill(nums, c0, c0 + c1, 1);
        Arrays.fill(nums, c0 + c1, c0 + c1 + c2, 2);
    }
}