package Assignment1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


class Q1Soln {

    // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] num={2,54,45,6,42,64,12};
        int target=14;
      int[] arr2=  findTwoSum(num,target);
     for(int x:arr2){
         System.out.println(x);
     }
    }
}