package Assignment_9;

public class Q2 {
    public int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }



    public static void main(String[] args) {
        Q2 obj = new Q2();
        int num = 5;

        var result = obj.findSum(num);
        System.out.print(result);

    }
}
