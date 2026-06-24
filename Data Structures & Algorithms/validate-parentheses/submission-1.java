class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else
            {
                if(st.isEmpty()){
                    return false;
                }
                if(!st.isEmpty()){
                    char tp = st.peek();
                    if(ch == ')' && tp == '(' || ch == ']' && tp == '[' || ch == '}' && tp == '{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }

            }
        }
        if(!st.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    
}
