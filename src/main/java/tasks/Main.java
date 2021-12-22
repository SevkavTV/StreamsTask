package tasks;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> arr1 = Arrays.asList("1","2","3", "abc");
        System.out.println(MapTask.mapping(arr1));

        List<String> arr2 = Arrays.asList("abc", "def", "ghj");
        System.out.println(FlattingTask.flattingStrings(arr2));

        int n = 100;
        System.out.println(FizzBuzzTask.fizzBuzzIt(n));

        List<String> arr4 = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(GroupWordsTask.mapping(arr4));
    }

}
