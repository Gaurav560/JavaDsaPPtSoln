package Assignment5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Q4Soln {

        public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            result.add(new ArrayList<>());
            int[] common = new int[2001];
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < nums1.length; i++) common[nums1[i] + 1000]++;
            for(int i = 0; i < nums2.length; i++){
                if(common[nums2[i] + 1000] == 0){
                    set.add(nums2[i]);
                }
            }
            for(int i : set){
                result.get(1).add(i);
            }

            common = new int[2001];
            set = new HashSet<>();

            for(int i = 0; i < nums2.length; i++) common[nums2[i] + 1000]++;
            for(int i = 0; i < nums1.length; i++){
                if(common[nums1[i] + 1000] == 0){
                    set.add(nums1[i]);
                }
            }
            for(int i : set){
                result.get(0).add(i);
            }

            return result;
        }


    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        List<List<Integer>> newList=findDifference(nums1,nums2);
        System.out.println(newList);
    }
}