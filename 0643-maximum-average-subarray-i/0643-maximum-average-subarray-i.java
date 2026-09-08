class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

// first k elements
for(int i = 0; i < k; i++){
    sum += nums[i];
}

int maxs = sum;

// slide window one position at a time
for(int i = k; i < nums.length; i++){
    sum = sum - nums[i-k] + nums[i];
    maxs = Math.max(maxs, sum);
}
return (double)maxs/k;
    }
}