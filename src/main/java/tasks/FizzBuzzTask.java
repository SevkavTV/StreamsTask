package tasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(int numOfElements) {
        return IntStream.range(0, numOfElements)
                .mapToObj(x -> {
                    if (x % 15 == 0) {
                        return "FizzBuzz";
                    } else if (x % 3 == 0) {
                        return "Fizz";
                    } else {
                        return Integer.toString(x);
                    }
                })
                .collect(Collectors.toList());
    }
}
