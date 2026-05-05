class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(String c:tokens){
          if(c.equals("+") && st.size()>=2){
             st.push(st.pop()+st.pop());
          }
          else if (c.equals("-") && st.size()>=2) {
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            } else if (c.equals("*") && st.size()>=2) {
                st.push(st.pop() * st.pop());
            } 
            else if(c.equals("/") && st.size()>=2){
               int a=st.pop();
               int b=st.pop();
               st.push(b/a);
            }
          else{
            st.push(Integer.parseInt(c));
          }
        }
        return st.pop();  
    }
}
