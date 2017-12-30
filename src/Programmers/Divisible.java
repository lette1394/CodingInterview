package Programmers;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Divisible {
    public int[] divisible(int[] array, int divisor) {

        return Arrays
                .stream(array)
                .filter(n -> n % divisor == 0)
                .toArray();

    }
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));

        int i = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(4)
                .flatMapToInt(t -> Arrays.stream(t))
                .reduce((a, b) -> b)
                .getAsInt();


        //System.out.println(i);

        Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0] + t[1]})
            .flatMapToLong(t -> Arrays.stream(t))
            .distinct()
            .skip(1)
            .limit(10)
            .forEach(t -> System.out.print(t + " "));

        System.out.println("\n");

        Arrays.asList(new Integer(10), new Integer(20), new Integer(30))
                .stream()
                .mapToInt(Integer::intValue)
                .peek(n -> {
                    for(int k = 0; k < n; k++) {
                        System.out.print(" "+k);
                    }
                    System.out.print(",");
                })
                .average()
                .ifPresent(a -> System.out.println("평균 : " + a));
    }
}