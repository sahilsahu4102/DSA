class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        char[] a=s.toLowerCase().toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(a[i])){
                sb.append(a[i]);
            }
        }
        int l=0;
        int h=sb.length()-1;
        char[] b=sb.toString().toCharArray();
        boolean p=true;
        while(l<h){
            if(b[l]!=b[h]){
                p=false;
            }
            l++;
            h--;
        }
        return p;
    }
}