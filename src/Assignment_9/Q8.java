package Assignment_9;

public class Q8 {

    public int product(int ar[], int n)
    {
        int result = 1;
        for (int i = 0; i < n; i++)
            result = result * ar[i];
        return result;
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[] arr = {1, 2, 3, 4, 5};

        var result =obj.product(arr,arr.length);
        System.out.println(result);
    }
}
