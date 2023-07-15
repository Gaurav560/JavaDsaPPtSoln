package Assignment11;

public class Q2Soln {
    public  static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid == 0) {
                return nums[0] >= nums[1] ? 0 : 1;
            }
            if (mid == end) {
                return nums[end - 1] >= nums[end - 2] ? end - 1 : end - 2;
            }

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            }
            if (nums[mid] < nums[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int ans=findPeakElement(nums);
        System.out.println(ans);
    }
}

