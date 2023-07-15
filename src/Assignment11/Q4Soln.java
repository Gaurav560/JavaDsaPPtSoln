package Assignment11;

import java.util.HashSet;

public class Q4Soln {

        public static int findDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                if(!set.add(num)) {
                    return num;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        int ans=findDuplicate(nums);
        System.out.println(ans);
    }
    }



