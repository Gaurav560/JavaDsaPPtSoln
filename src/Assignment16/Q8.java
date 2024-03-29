package Assignment16;




import java.util.*;

class Q8
{


    static void leftSmaller(int arr[], int n, int SE[])
    {
        // Create an empty stack
        Stack<Integer> S = new Stack<>();

        for (int i = 0; i < n; i++)
        {
            while (!S.empty() && S.peek() >= arr[i])
            {
                S.pop();
            }


            if (!S.empty())
            {
                SE[i] = S.peek();
            }

            else
            {
                SE[i] = 0;
            }


            S.push(arr[i]);
        }
    }

    static int findMaxDiff(int arr[], int n)
    {
        int[] LS = new int[n];


        leftSmaller(arr, n, LS);


        int[] RRS = new int[n];
        // reverse array
        reverse(arr);
        leftSmaller(arr, n, RRS);


        int result = -1;
        for (int i = 0; i < n; i++)
        {
            result = Math.max(result, Math.abs(LS[i] - RRS[n - 1 - i]));
        }

        return result;
    }

    static void reverse(int a[])
    {
        int i, k, n = a.length;
        int t;
        for (i = 0; i < n / 2; i++)
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = {2, 4, 8, 7, 7, 9, 3};
        int n = arr.length;
        System.out.println("Maximum diff : "
                + findMaxDiff(arr, n));
    }
}


