package AssignMent_24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q6 {

    public List<String> topKFrequent(String[] words, int k) {
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByKey())
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        String[] str = {"i","love","leetcode","i","love","coding"};
        int nums = 2;
        var result = obj.topKFrequent(str,nums);
        System.out.println(result);
    }
}
