import java.util.Stack;

public class Parenthesis {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
                                                                                        //String s = "(()[{}]]";
            if (isOpening(cur)) {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatching(stack.peek(), cur)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public static void main(String[] args) {
        String s = "(()[{}]]";
        if (isBalanced(s)) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("NOT BALANCED");
        }
    }
}
