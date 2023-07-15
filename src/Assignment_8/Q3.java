package Assignment_8;

public class Q3 {

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        return helper(word1,word2,n-1,m-1);
    }
    private int helper(String s,String t,int i,int j) {
        //once ith length finishes. remaining j length will be needed to deleted to make same.
        if(i<0) {
            return j+1;
        }
        if(j<0) {
            return i+1;
        }
        if(s.charAt(i)==t.charAt(j)) {
            return helper(s,t,i-1,j-1);
        }
        return Math.min(helper(s,t,i-1,j),helper(s,t,i,j-1))+1;
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        String s ="sea";
        String t ="eat";
        var result = obj.minDistance(s,t);
        System.out.print(result);
    }
}
