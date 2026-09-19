class Solution {
    public String removeDuplicates(String s) {

        char a[] = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < a.length; i++) {

            if(!st.isEmpty() && a[i] == st.peek()) {
                st.pop();
            }
            else {
                st.push(a[i]);
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}