package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeStream {
    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
    }
}
