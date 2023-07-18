package AssignMent_24;

import java.util.*;

public class Q4 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> dp = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String st = strs[i];
            char[] ar = st.toCharArray();
            Arrays.sort(ar);
            String token = new String(ar);
            List<String> exist = dp.getOrDefault(token,new ArrayList<String>());
            exist.add(st);
            dp.put(token,exist);
        }
        for(Map.Entry<String,List<String>> ent: dp.entrySet()){
            res.add(ent.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        Q4 obj = new Q4();
        String[] nums = {"eat","tea","tan","ate","nat","bat"};
        var result = obj.groupAnagrams(nums);
        System.out.println(result);
    }
}
