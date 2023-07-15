package Assignment_10;

public class Q3 {

    public void powerSet(String str, int index, String curr)
    {
        int n = str.length();
        if (index == n) {
            return;
        }
        System.out.println(curr);


        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            powerSet(str, i, curr);
            curr = curr.substring(0, curr.length() - 1);
        }
    }



    public static void main(String[] args) {
        Q3 obj = new Q3();
        String str = "abc";
        int index = -1;
        String curr = "";

       obj.powerSet(str, index, curr);

    }
}
