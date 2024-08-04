package String;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String s= "({})";
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c =='('||c=='{')
            stack.push(c);
            else {
                if (stack.isEmpty())
                    System.out.println("Empty");

                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                } else { // Otherwise, the brackets don't match, so return false
                }
            }
        }
    }
}
