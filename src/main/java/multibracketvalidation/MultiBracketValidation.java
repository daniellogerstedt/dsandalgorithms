package multibracketvalidation;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String s) {
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' :
                    brackets.push('(');
                    break;
                case '{' :
                    brackets.push('{');
                    break;
                case '[' :
                    brackets.push('[');
                    break;
                case ')' :
                    if (brackets.peek() != '(') return false;
                    brackets.pop();
                    break;
                case '}' :
                    if (brackets.peek() != '{') return false;
                    brackets.pop();
                    break;
                case ']' :
                    if (brackets.peek() != '[') return false;
                    brackets.pop();
                    break;
            }
        }
        return brackets.top == null;
    }

}
