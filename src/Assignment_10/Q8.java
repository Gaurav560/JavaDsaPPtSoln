package Assignment_10;

public class Q8 {

    public boolean isConsonant(char ch)
    {

        ch = Character.toUpperCase(ch);

        return !(ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' ||
                ch == 'U') && ch >= 65 && ch <= 90;
    }

    public int totalConsonants(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)

            if (isConsonant(str.charAt(i)))
                ++count;
        return count;
    }


    public static void main(String[] args) {
        Q8 obj = new Q8();
        String n = "abc de";
        var result = obj.totalConsonants(n);
        System.out.println(result);
    }
}
