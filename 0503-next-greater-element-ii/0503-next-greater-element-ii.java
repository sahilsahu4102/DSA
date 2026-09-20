class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums.length*2-1;i>=0;i--){
            int l=i%nums.length;
            while(!s.isEmpty()&&s.peek()<=nums[l]){
                s.pop();
            }
            if(s.isEmpty())ans[l]=-1;
            else ans[l]=s.peek();
            s.push(nums[l]);

        }
        return ans ;    
    }
}