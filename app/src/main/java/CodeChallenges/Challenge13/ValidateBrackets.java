package CodeChallenges.Challenge13;

import CodeChallenges.Challenge10.Stack;

public class ValidateBrackets {

//    Stack<Character> stack = new Stack<>();
//
//    public boolean validateBrackets(String string) {
//
//        boolean isValidate = false;
//        for (int i = 0; i < string.length(); i++) {
//
//            if (string.charAt(i) == '(' || string.charAt(i) == '[' || string.charAt(i) == '{')
//            {
//                // Push the element in the stack
//                stack.push(string.charAt(i));
//                continue;
//            }
//
//            if (stack.isEmpty())
//                return false;
//            char test;
//            switch (string.charAt(i)) {
//                case ')':
//                    test = stack.pop();
//                    if (test == '{' || test == '[')
//                        return false;
//                    break;
//
//                case '}':
//                    test = stack.pop();
//                    if (test == '(' || test == '[')
//                        return false;
//                    break;
//
//                case ']':
//                    test = stack.pop();
//                    if (test == '(' || test == '{')
//                        return false;
//                    break;
//            }
//        }
//        return stack.isEmpty();
//    }
}
