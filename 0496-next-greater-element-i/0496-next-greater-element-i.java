class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int ans[] = new int[nums2.length];

        // Array stack
        int stack[] = new int[nums2.length];
        int top = -1;

        for(int i = nums2.length - 1; i >= 0; i--) {

            while(top != -1 && nums2[stack[top]] <= nums2[i]) {
                top--;
            }

            if(top == -1)
                ans[i] = -1;
            else
                ans[i] = nums2[stack[top]];

            stack[++top] = i;
        }

        int res[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {

                if(nums2[j] == nums1[i]) {
                    res[i] = ans[j];
                    break;
                }
            }
        }

        return res;
    }
}