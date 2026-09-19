class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums2.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty()&&nums2[s.peek()]<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty())ans[i]=-1;
            else ans[i]=nums2[s.peek()];
            s.push(i);
        }
        int res[]=new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]) {
                    res[i] = ans[j];
                    
                }
            }
        }
        return res;
    }
}