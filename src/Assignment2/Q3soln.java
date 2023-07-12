package Assignment2;

import java.util.Arrays;

class Q3Soln {
    public static int findLHS(int[] nums) {
        int i=0;
        //   int c=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        Arrays.sort(nums);
        if(nums[0]==nums[nums.length-1])
        {
            return 0;
        }
        int min1=0;
        int max1=0;
        int lhs=Integer.MIN_VALUE;
        while(i<nums.length)
        {
            if(min>nums[i])
            {
                min1=i;
                min=nums[i];
            }
            if(max<=nums[i])
            {
                max1=i;
                max=nums[i];
            }
            if((max-min)>1)
            {
                min1++;
                min=nums[min1];
            }
            else if((max-min)<1)
            {
                i++;
            }
            else{
                lhs=Math.max(lhs,(max1-min1)+1);
                i++;
            }

        }
        return lhs<0 ? 0 : lhs;

    }

    public static void main(String[] args) {
        int[] nums={1,3,2,2,5,2,3,7};
        int k=findLHS(nums);
        System.out.println(k);
    }
}