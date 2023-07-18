package Assignmnet15;

// Java program to evaluate value of a postfix expression

import java.util.Stack;

public class Q6 {


    static int evaluatePostfix(String exp)
    {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);


            if (Character.isDigit(c))
                stack.push(c - '0');


            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // Driver code
    public static void main(String[] args)
    {
        String exp = "231*+9-";

        // Function call
        System.out.println("postfix evaluation: "
                + evaluatePostfix(exp));
    }
}

