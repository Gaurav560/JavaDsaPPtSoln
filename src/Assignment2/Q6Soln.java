package Assignment2;

class Q6Soln {
    public static int search(int[] nums, int target) {
        int si= 0;
        int ei = nums.length-1;
        while(si<=ei){
            int mid = (ei-si)/2 + si;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        int ans=search(nums,target);
        System.out.println(ans);

    }
}
