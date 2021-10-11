import java.util.ArrayDeque;
import java.util.Deque;

public class Ex1 {

    public static boolean isValid(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == ']') {
                if (stack.size() > 0 && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == '}') {
                if (stack.size() > 0 && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid2(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        char[] str = s.toCharArray();

        for (char item : str) {
            if (item == '(') {
                stack.push(')');
            } else if (item == '[') {
                stack.push(']');
            } else if (item == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != item)
                return false;
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String str = "()(([])){[[()]]}";
        System.out.println(isValid(str));
        System.out.println(isValid2(str));

    }
}
