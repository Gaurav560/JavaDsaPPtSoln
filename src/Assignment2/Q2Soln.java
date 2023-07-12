package Assignment2;

import java.util.HashSet;
import java.util.Set;

class Q2Soln {
    public  static int distributeCandies(int[] candyType) {

        Set<Integer> st=new HashSet<>();

        for(int i=0;i<candyType.length;i++){
            st.add(candyType[i]);
            if(st.size()>candyType.length/2)return candyType.length/2;
        }

        return st.size();

    }

    public static void main(String[] args) {
        int[] candyType={1,1,2,2,3,3};
        int ans=distributeCandies(candyType);
        System.out.println(ans);
    }
}