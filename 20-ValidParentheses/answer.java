class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1){return false;}

        Stack<Character> stack = new Stack();
        HashMap<Character, Character> map = new HashMap<Character, Character>(){{
            put('}' ,'{');
            put(')' ,'(');
            put(']' , '[');
        }
        };
        for (char c : s.toCharArray()){
            if (c == '(' || c=='[' || c=='{'){
                stack.add(c);
            } else {
                if (!stack.isEmpty() && stack.peek() == map.get(c)){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

