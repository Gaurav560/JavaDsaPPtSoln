package Assignment_7;

import java.util.ArrayList;

public class Q2 {

     ArrayList<String> numdef(int n, int length)
    {
        ArrayList<String> result = new ArrayList<String>();
        if (n == 0)
            return result;
        if (n == 1) {
            result.add("1");
            result.add("0");
            result.add("8");
            return result;
        }

        ArrayList<String> middles = numdef(n - 2, length);

        for (String middle : middles) {
            if (n != length)
                result.add("0" + middle + "0");

            result.add("8" + middle + "8");
            result.add("1" + middle + "1");
            result.add("9" + middle + "6");
            result.add("6" + middle + "9");
        }
        return result;
    }
     ArrayList<String> strobogrammatic_num(int n)
    {
        ArrayList<String> result = numdef(n, n);
        return result;
    }




    public static void main(String[] args) {
        Q2 obj = new Q2();
        int num = 69;
        var result = obj.strobogrammatic_num(num);
        System.out.print(result);

    }
}
