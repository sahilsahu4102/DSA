class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        int[] s = new int[nums.length];
        int top=-1;
        for(int i=nums.length*2-1;i>=0;i--){
            int l=i%nums.length;
            while(!(top==-1)&&s[top]<=nums[l]){
                top--;
            }
            if(top==-1)ans[l]=-1;
            else ans[l]=s[top];
            top++;
            s[top]=nums[l];

        }
        return ans ;    
    }
}