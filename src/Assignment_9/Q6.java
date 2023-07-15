package Assignment_9;

public class Q6 {

    public  int Nth_of_AP(int a,int d,int N)
    {
        return ( a + (N - 1) * d );
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        int num1 = 2;
        int num2 = 1;
        int num3 = 5;

        var result = obj.Nth_of_AP(num1,num2,num3);
        System.out.print(result);

    }
}
