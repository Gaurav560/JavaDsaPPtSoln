package Assignment11;

class Solution {
    public static int mySqrt(int x) {
        int low = 1 , high = x  , ans = 0;

        while (low <= high){
            int mid = low + (high - low) /2;

            if (x/mid == mid) return mid;
            else if (x/mid < mid)  high = mid-1;
            else {
                low= mid + 1; ans=mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int input=4;
        int ans=mySqrt(input);
        System.out.println(ans);
    }

}