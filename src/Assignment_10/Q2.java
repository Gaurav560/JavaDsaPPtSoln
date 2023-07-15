package Assignment_10;

public class Q2 {

    public int lastRemaining(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            int temp = lastRemaining(n / 2);
            result = 2 * (1 + n / 2 - temp);
        }
        return result;
    }

    public static void main(String[] args) {
        Q2 obj = new Q2();
        int n = 9;
        var result = obj.lastRemaining(n);
        System.out.println(result);
    }
}
