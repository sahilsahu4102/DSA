class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int h = 1;
        int k = 1;

        while(h < nums.length) {

            if(nums[l] != nums[h]) {
                nums[k] = nums[h];
                k++;
                l++;
            }

            h++;
        }

        return k;
    }
}