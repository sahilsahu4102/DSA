class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

int l = 0;
int h = nums.length - 1;
int k = nums.length - 1;

while (l <= h) {
    if (nums[l] * nums[l] > nums[h] * nums[h]) {
        ans[k] = nums[l] * nums[l];
        l++;
    } else {
        ans[k] = nums[h] * nums[h];
        h--;
    }
    k--;
}

return ans;
    }
}