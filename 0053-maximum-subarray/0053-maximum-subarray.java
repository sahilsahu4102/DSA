class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            best=Math.max(sum,best);
            if(sum<0){
                sum=0;
            }
        }
        return best;
    }
}