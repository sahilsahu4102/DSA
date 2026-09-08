class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
        int best=0;
        while(l<h){
            int curr=Math.min(height[l],height[h])*(h-l);
            if(curr>best){
                best=curr;
            }
            int minn=Math.min(height[l],height[h]);
            while(height[l]<=minn&&l<h){
                l++;
            }while(height[h]<=minn&&l<h){
                h--;
            }
        }
        return best;
    }
}