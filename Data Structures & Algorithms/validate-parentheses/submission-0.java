class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');
        for(char r : s.toCharArray()){
            if(closeToOpen.containsKey(r)){
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(r)){
                    stack.pop();
                } else{
                    return false;
                }
            } else{
            stack.push(r);
            }
            
        }
        return stack.isEmpty();
        }
}
