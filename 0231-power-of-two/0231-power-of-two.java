class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean a=n>0&&(n&(n-1))==0?true:false;
        return a;
    }
}