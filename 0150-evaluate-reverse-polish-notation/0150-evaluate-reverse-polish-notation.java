class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if (!tokens[i].equals("+") &&
    !tokens[i].equals("-") &&
    !tokens[i].equals("*") &&
    !tokens[i].equals("/")) {

    st.push(Integer.parseInt(tokens[i]));
}
            if(tokens[i].equals("+")){
                int sum=0;
                sum+=st.pop();
                sum+=st.pop();
                st.push(sum);
            }
            if(tokens[i].equals("-")){
                int num2=st.pop();
                int num1=st.pop();
                st.push(num1-num2);
            }
            if(tokens[i].equals("*")){
                int num2=st.pop();
                int num1=st.pop();
                st.push(num1*num2);
            }
            if(tokens[i].equals("/")){
                int num2=st.pop();
                int num1=st.pop();
                st.push(num1/num2);
            }
            
        }
        return st.peek();
    }
}