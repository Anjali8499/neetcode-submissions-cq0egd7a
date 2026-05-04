class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack= new Stack<>();
        Map<Character, Character> hm= new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        for(char ch : s.toCharArray()){
            if(hm.containsKey(ch)){
               if(!stack.isEmpty() && stack.peek()== hm.get(ch)){
                stack.pop();
               }
               else{
                return false;
               }
            }else{
                stack.push(ch);
            }
        }

        return stack.isEmpty();
        
    }
}
