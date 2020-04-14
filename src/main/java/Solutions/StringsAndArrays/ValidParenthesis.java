package Solutions.StringsAndArrays;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String string) {
        if (string == null || string.length() == 1) return false;

        char[] chars = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            try {

                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(c);
                        break;
                    case '}':
                        if (stack.pop() != '{') return false;
                        break;
                    case ']':
                        if (stack.pop() != '[') return false;
                        break;
                    case ')':
                        if (stack.pop() != '(') return false;
                        break;
                    default:
                        break;
                }
            } catch (EmptyStackException e) {
                return false;
            }

        }

        return stack.isEmpty();
    }
}
