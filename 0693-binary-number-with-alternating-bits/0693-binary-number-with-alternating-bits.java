class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=n&1;
        n=n>>1;
        boolean alt=true;
        while(n>0){
            if((n&1)==prev){
                alt=false;
            }
            prev=n&1;
            n=n>>1;
        }
        return alt;
    }
}