package AssignMent_24;

public class Q3 {

    public  int majorityElement(int[] nums) {
        return helper(nums,0,nums[0]);
    }
    public int helper(int[] nums, int si, int ref){
        int c=0;
        for(int i=si;i<nums.length;i++){
            if(nums[i]==ref)
                c++;
            else
                c--;
            if(c==-1)
                return helper(nums,i,nums[i]);
        }return ref;
    }


    public static void main(String[] args) {
        Q3 obj = new Q3();
        int[] nums = {3, 2, 3};
        var result = obj.majorityElement(nums);
        System.out.println(result);
    }
}
