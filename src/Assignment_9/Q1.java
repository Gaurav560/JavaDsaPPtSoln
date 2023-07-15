package Assignment_9;

import Assignment_8.Q8;

public class Q1 {

    public boolean isPowerOfTwo(int n) {
        if (((n<=0)) || (Integer.lowestOneBit(n) != n)) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
      int num = 3;

        var result = obj.isPowerOfTwo(num);
        System.out.print(result);

    }
}
