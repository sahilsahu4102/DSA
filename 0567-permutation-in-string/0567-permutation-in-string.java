class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int k=s1.length();
        char[] freq=new char[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int left=0;
        char[] freq2=new char[26];
        for(int i=0;i<k;i++){
            freq2[s2.charAt(i)-'a']++;
        }
        for(int i=k;i<s2.length();i++){
            if(Arrays.equals(freq,freq2))return true;
            freq2[s2.charAt(i-k)-'a']--;
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,freq2))return true;
        return false;
    }
}