package Assignment5;

import java.util.Arrays;

public class Q3Soln {

        public static int[] sortedSquares(int[] nums) {
            for(int i = 0;i<nums.length;i++)
            {
                nums[i] *= nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }

    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] ans=sortedSquares(nums);
        for (int x:ans
             ) {
            System.out.print(x+" ");
        }
    }
    }


