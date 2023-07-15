package Assignment_10;

public class Q4 {

    public int recLen(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        Q4 obj = new Q4();
        String s = "abcd";
        var result = obj.recLen(s);
        System.out.println(result);
    }
}
