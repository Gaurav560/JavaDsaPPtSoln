package Assignment16;

// Java program to reverse the number
// using a stack
import java.util.Stack;

public class Q5
{

    static Stack<Integer> st= new Stack<>();


    static void push_digits(int number)
    {
        while(number != 0)
        {
            st.push(number % 10);
            number = number / 10;
        }
    }

    // Function to reverse the number
    static int reverse_number(int number)
    {
        // Function call to push number's
        // digits to stack
        push_digits(number);
        int reverse = 0;
        int i = 1;

        // Popping the digits and forming
        // the reversed number
        while (!st.isEmpty())
        {
            reverse = reverse + (st.peek() * i);
            st.pop();
            i = i * 10;
        }


        return reverse;
    }


    public static void main(String[] args)
    {
        int number = 39997;
        System.out.println(reverse_number(number));
    }
}
