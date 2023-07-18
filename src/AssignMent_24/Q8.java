package AssignMent_24;

import java.util.ArrayList;
import java.util.List;

public class Q8 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int start = 0;
        int end = arr.length - 1;
        while (end - start >= k) {
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[] nums = {1,2,3,4,5};
        int x = 3;
        int k = 4;
        var result = obj.findClosestElements(nums,k,x);
        System.out.println(result);
    }
}
