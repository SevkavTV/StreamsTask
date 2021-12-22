package tasks;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<String, Integer> mapping(List<String> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .map(GroupWordsTask::transform)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static Map.Entry<String, Integer> transform(Map.Entry<Character, List<String>> val) {
        return new AbstractMap.SimpleEntry<>(String.valueOf(val.getKey()), (int)String.join("", val.getValue()).chars().filter(ch -> ch == val.getKey()).count());
    }
}
