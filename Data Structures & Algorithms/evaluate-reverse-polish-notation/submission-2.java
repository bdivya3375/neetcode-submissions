class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(String ch : tokens){
            int res = 0;
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                st.push(Integer.parseInt(ch));
            }
            else{
                int b = st.pop();
                int a = st.pop();
                if(ch.equals("+")){
                    res = a+b;
                    st.push(res);
                }
                else if(ch.equals("-")){
                    res = a-b;
                    st.push(res);
                }
                else if(ch.equals("*")){
                    res = a*b;
                    st.push(res);
                }
                else{
                    res = a/b;
                    st.push(res);
                }
                
            }
            
        }
        return st.pop();
        
    }
}
