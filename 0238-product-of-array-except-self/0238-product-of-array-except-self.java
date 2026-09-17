class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int n=nums.length;
        Arrays.fill(res,1);
        for(int i=0;i<n;i++){
            int j=0;
            while(j<i){
                res[i]*=nums[j];
                j++;
            }
            int k=nums.length-1;
            while(i<k){
                res[i]*=nums[k];
                k--;
            }
        }
        return res;
    }
}