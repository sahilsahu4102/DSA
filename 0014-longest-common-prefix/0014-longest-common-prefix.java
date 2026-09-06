class Solution {
    public String longestCommonPrefix(String[] strs) {

        char[] arr = new char[200];
        int length = strs[0].length();

        for (int i = 0; i < strs[0].length(); i++) {
            arr[i] = strs[0].charAt(i);
        }

        for (int i = 1; i < strs.length; i++) {

            for (int j = 0; j < strs[i].length() && j < length; j++) {

                if (strs[i].charAt(j) != arr[j]) {
                    length = j;
                    break;
                }
            }

            // If current string is shorter than the current prefix
            if (strs[i].length() < length) {
                length = strs[i].length();
            }
        }

        return new String(arr, 0, length);
    }
}