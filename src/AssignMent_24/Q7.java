package AssignMent_24;

public class Q7 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int max=0;
        int arr[] = new int[nums.length-k+1];
        int r=0;
        for(int i=0;i<=nums.length-k;i++)
        {
            max=nums[i];
            for(int j =1;j<k;j++)
            {
                if(nums[i+j]>max)
                {
                    max = nums[i+j];
                }
            }
            arr[r++] = max;
        }
        return arr;
    }

    public static void main(String[] args) {
        Q7 obj = new Q7();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        var result = obj.maxSlidingWindow(nums,k);
        System.out.print("[");
        for (int x:result
             ) {
            System.out.print(x+" ");

        }
        System.out.print("]");

    }
}
