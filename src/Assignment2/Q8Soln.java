package Assignment2;

import java.util.Arrays;

class Q8Soln
{
    public static int smallestRangeI(int[] A, int k) {
        Arrays.sort(A);
        if(A[0]+k >= A[A.length-1]-k)
            return 0;
        return A[A.length-1]-k-(A[0]+k);
    }

    public static void main(String[] args) {
        int[] A={1};
        int k=0;
        int ans=smallestRangeI(A,k);
        System.out.println(ans);
    }

}