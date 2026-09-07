class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            if(nums[l]+nums[h]>target){
                h--;
            }else if(nums[l]+nums[h]<target){
                l++;
            }else if(nums[l]+nums[h]==target){
                break;
            }
        }
        return new int[]{l+1,h+1};
    }
}