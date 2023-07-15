package Assignment_10;

public class Q1 {

    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n%3 !=0 || n<=0) return false;
        return isPowerOfThree(n/3);
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
        int n = 27;
        var result = obj.isPowerOfThree(n);
        System.out.println(result);
    }
}
