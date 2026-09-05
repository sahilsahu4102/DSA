class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> np=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!np.add(nums[i])){
                return nums[i];
            }
            np.add(nums[i]);
        }
        return -1;
    }
}