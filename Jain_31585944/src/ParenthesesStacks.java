import java.util.Stack;
public class ParenthesesStacks {
    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        String opening = "([{";
        String closing = ")]}";
        for (char c : parentheses.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                stack.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (opening.indexOf(top) != closing.indexOf(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String[] braketsArr = {
                "(()()()())",
                "(((())))",
                "(()((())()))",
                "((((((())",
                "())",
                "(()()(()"
        };
        for (String test : braketsArr) {
            if (isBalanced(test)) {
                System.out.println(test + ": Balanced");
            } else {
                System.out.println(test + ": Not Balanced");
            }
        }
    }
}