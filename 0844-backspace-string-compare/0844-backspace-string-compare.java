class Solution {
    public String ab(String a) {
        char[] b = a.toCharArray();
        char[] s = new char[a.length()];
        int top = -1;
        for (int i = 0; i < a.length(); i++) {
            if (b[i] == '#') {
                if (top != -1) {
                    top--;
                }
            } else {
                ++top;
                s[top] = b[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(s[i]);
        }
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String a = ab(s);
        String b = ab(t);
        return a.equals(b);
    }
}