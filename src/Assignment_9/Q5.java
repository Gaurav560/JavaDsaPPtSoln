package Assignment_9;

public class Q5 {

    public  int findMaxRec(int A[], int n)
    {

        if(n == 1)
            return A[0];

        return Math.max(A[n-1], findMaxRec(A, n-1));
    }


    public static void main(String[] args) {
        Q5 obj = new Q5();
        int[] s = {1, 4, 3, -5, -4, 8, 6};
        int num = s.length;

        var result = obj.findMaxRec(s , num);
        System.out.print(result);

    }
}
