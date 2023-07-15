package Assignment_9;

public class Q4 {

    public double myPow(double x, int n) {


        if (x < -10000 || x > 10000) {
            return 0;
        }


        if (n == 0) {
            return 1;
        }


        if (n < 0) {
            n = -n;
            x = 1 / x;
        }


        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }


        else {
            return x * myPow(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Q4 obj = new Q4();
        int num = 2;
        double s = 5;
        var result = obj.myPow(s,num);
        System.out.print(result);

    }
}
