package Assignment5;

import java.util.HashSet;
import java.util.Set;

class Q2Soln {





        public  static int arrangeCoins(int n) {
            int i;
            for(i=1; i<=n; i++){
                n = n-i;
            }
            return i-1;
        }


    public static void main(String[] args) {
        int n=5;
        int ans=arrangeCoins(n);
        System.out.println(ans);
    }
}