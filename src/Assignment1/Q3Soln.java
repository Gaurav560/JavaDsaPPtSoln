package Assignment1;

public class Q3Soln {
    public static int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;
        }

        int l=0;
        int r=nums.length-1;

        while(l<r){
            int m = l+(r-l)/2;
            if(target>nums[m]){
                l=m+1;
            }else{
                r=m;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] arrr={1,3,5,6};
        int target=5;
        int k=searchInsert(arrr,target);
        System.out.println(k);
    }
}
