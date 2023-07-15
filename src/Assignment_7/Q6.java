package Assignment_7;

public class Q6 {

    public String shift(String s){
        String ans = "";
        for(int i=1;i<s.length();i++){
            ans += s.charAt(i);
            if(i == s.length()-1){
                ans += s.charAt(0);
            }
        }
        return ans;
    }

    public boolean rotateString(String s, String goal) {
        boolean ans = false;
        int n = s.length();
        while(n!=0){
            if(s.equals(goal)){
                ans = true;
                break;
            }else{
                s = shift(s);
            }
            n--;
        }

        return ans;
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        String s = "abcde";
        String goal = "cdeab";
        var result = obj.rotateString(s,goal);
        System.out.print(result);

    }
}
