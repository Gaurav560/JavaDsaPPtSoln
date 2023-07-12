package Assignment2;

import java.util.Arrays;

class Q1Soln {
    public  static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length ; i += 2){
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        int ans=arrayPairSum(nums);
        System.out.println(ans);
    }

}