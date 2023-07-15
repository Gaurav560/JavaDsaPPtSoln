package Assignment11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q5Soln {

        public static int[] intersection(int[] arr1, int[] arr2) {
            Set<Integer> se=new HashSet<>();
            for(int i=0;i<arr1.length;i++){
                se.add(arr1[i]);
            }
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<arr2.length;i++){
                int a=arr2[i];
                if(se.contains(a)){
                    li.add(a);
                    se.remove(a);
                }
            }
            int[] ans=new int[li.size()];
            for(int i=0;i<ans.length;i++){
                ans[i]=li.get(i);
            }
            return ans;
        }

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] ans=intersection(arr1,arr2);
        for (int x:ans
             ) {
            System.out.println(x);
        }
    }
    }


