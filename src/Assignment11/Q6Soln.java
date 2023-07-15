package Assignment11;

public class Q6Soln {


        public static int findMin(int[] nums) {
            int l=0,h=nums.length-1;
            while(l<h)
            {
                int mid=l+(h-l)/2;
                if(nums[mid]>nums[h])
                    l=mid+1;
                else
                    h=mid;
            }
            return nums[h];
        }

    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        int ans=findMin(nums);
        System.out.println(ans);
    }
    }

