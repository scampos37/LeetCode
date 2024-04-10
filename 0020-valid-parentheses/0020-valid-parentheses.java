class Solution {
    public boolean isValid(String s) {
        //create stack
        Stack<Character> stack = new Stack<Character>();
        //checks if input is an opening backet and pushes the closing bracket to the stack
        //then returns false if stack empties before string is fully checked (not enough opening brackets for each closing bracket)
        //or if the closing bracket doesn't match the top of the stack (different opening and closing bracket combination, i.e. {), [), {], etc.)
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        //returns true if stack is empty and false if stack still contains values.
        return stack.isEmpty();
    }
}