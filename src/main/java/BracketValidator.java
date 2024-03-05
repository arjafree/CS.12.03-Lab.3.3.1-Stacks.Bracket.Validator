import java.util.Stack;

public class BracketValidator {

    // Method called checkValidParentheses that returns a boolean indicating whether a string of brackets is valid or not.
    public static boolean checkValidParentheses(String expression) {

        // Obtain an array of the brackets (each element is a single bracket).
        String[] chars = expression.split("");
        // Create a stack.
        Stack stack = new Stack();



        // Iterate over the array of brackets.
        for(int i =0;i<chars.length; i++){
            String reverse = "";
            if(chars[i].equals("(")||chars[i].equals("[")||chars[i].equals("{")){
                stack.push(chars[i]);
            }

            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(!stack.pop().equals(reverse(chars[i]))){
                        return false;
                    }
                }

            }

        }

        return true;

    }
    public static String reverse(String s){
        if(s.equals(")")){
            return "(";
        }
        if(s.equals("(")){
            return ")";
        }
        if(s.equals("[")){
            return "]";
        }
        if(s.equals("]")){
            return "[";
        }
        if(s.equals("{")){
            return "}";
        }
        if(s.equals("}")){
            return "{";
        }
        return "";

    }

    // Private helper method called isLeftBracket that returns a boolean value to indicate whether the bracket is a left (opening) bracket.
    private static boolean isLeftBracket(String bracket) {

        return false;

    }

    // Private helper method called getReversedBracket that returns a String which is the reverse version of the bracket passed to the method.
    private static String getReversedBracket(String bracket) {

        return null;

    }
}
