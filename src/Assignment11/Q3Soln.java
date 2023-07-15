package Assignment11;

public class Q3Soln {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        for(int i=0;i<n;i++){
            totalSum -= nums[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] nums={3,0,1};
        int ans=missingNumber(nums);
        System.out.println(ans);
    }
}