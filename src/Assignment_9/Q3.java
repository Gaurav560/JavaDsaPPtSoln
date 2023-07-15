package Assignment_9;

public class Q3 {

    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        Q3 obj = new Q3();
        int num = 5;

        var result = obj.factorial(num);
        System.out.print(result);

    }
}
