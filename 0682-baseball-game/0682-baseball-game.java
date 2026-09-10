class Solution { 
    public int calPoints(String[] operations) { 
        Stack<Integer> st = new Stack<>(); 
        
        for (String ch : operations) { 
            
            if (ch.equals("+")) { 
                int sum = st.get(st.size() - 1) + st.get(st.size() - 2);
                st.push(sum); 
                
            } else if (ch.equals("D")) { 
                int temp = st.peek(); 
                st.push(temp * 2); 
                
            } else if (ch.equals("C")) { 
                st.pop(); 
                
            } else { 
                st.push(Integer.parseInt(ch)); 
            } 
        } 
        
        int ans = 0; 
        
        while (!st.isEmpty()) { 
            ans += st.pop(); 
        } 
        
        return ans; 
    } 
}