package Assignment1;

import java.util.Arrays;

class Q6Soln {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        boolean k=containsDuplicate(nums);
        System.out.println(k);
    }
}