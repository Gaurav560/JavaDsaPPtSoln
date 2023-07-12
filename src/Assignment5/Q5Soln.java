package Assignment5;

import java.util.Arrays;

class Q5Soln {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1];
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        int ans=maximumProduct(nums);
        System.out.println(ans);
    }
}