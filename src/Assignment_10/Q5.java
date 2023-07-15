package Assignment_10;

public class Q5 {

    public boolean checkEquality(String s)
    {
        return (s.charAt(0) == s.charAt(s.length() - 1));
    }

    public int countSubstringWithEqualEnds(String s)
    {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++)

            for (int len = 1; len <= n-i; len++)

                if (checkEquality(s.substring(i, i + len)))
                    result++;

        return result;
    }


    public static void main(String[] args) {
        Q5 obj = new Q5();
        String n = "abcab";
        var result = obj.countSubstringWithEqualEnds(n);
        System.out.println(result);
    }
}
