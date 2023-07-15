package Assignment_7;

import java.util.Stack;

public class Q7 {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!stack1.isEmpty() && c =='#') stack1.pop();
            else{
                if(c!='#')
                    stack1.push(c);

            }
        }

        for(int i=0;i<t.length();i++){
            char d= t.charAt(i);
            if(!stack2.isEmpty() && d=='#') stack2.pop();
            else{
                if(d!='#')
                    stack2.push(d);

            }
        }



        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
        Q7 obj = new Q7();
        String s = "ab#c";
        String k = "ad#c";
        var result = obj.backspaceCompare(s,k);
        System.out.print(result);

    }
}
