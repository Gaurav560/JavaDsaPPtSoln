package Assignment_7;

class Q3 {
    public String addStrings(String num1, String num2) {
        return add(num1, num2);
    }
    String add(String num1, String num2)
    {

        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int diff = num1.length() - num2.length();

        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = i - diff >= 0 ? num2.charAt(i - diff) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }


    public static void main(String[] args) {
        Q3 obj = new Q3();
        String num1 = "11";
        String num2 = "123";
        var result = obj.addStrings(num1,num2);
        System.out.print(result);

    }
}
