package AssignMent_24;

import java.util.HashSet;
import java.util.Set;

public class Q2 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {
        Q2 obj = new Q2();
        String n = "abcabcbb";
        var result = obj.lengthOfLongestSubstring(n);
        System.out.println(result);
    }
}
