package commonproblems.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.size() == 0) return false;
                if (map.get(c) == stack.get(stack.size() - 1)) stack.pop();
                else return false;
            }
        }
        return stack.size() == 0;
    }

}
