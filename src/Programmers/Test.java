package Programmers;

import java.math.BigInteger;
import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .filter(num -> num > 3)
                .collect(Collectors.toList());

        Stream<String> stream = Stream.of("Using", "Stream", "API", "From", "Java8");

        String[] wordArray = {"Using", "Stream", "API", "From", "Java8"};
        Stream<String> stream1 = Arrays.stream(wordArray, 0, 4);

        Stream<Integer> stream5 = Stream.iterate(1, n -> n + 1);
        Stream<Double> stream2 = Stream.generate(Math::random);
        Stream<BigInteger> stream3 = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));

        System.out.print(
                stream
                .limit(5000)
                .flatMap((String s) -> {
                    List<String> result = new ArrayList<>();
                    if (s.length() == 4) {
                        result.addAll(Arrays.asList(s.split("")));
                    }
                    else
                        return Stream.of(s);
                    return result.stream();
                    })
                .collect(Collectors.joining("_"))
        );

    }
}
