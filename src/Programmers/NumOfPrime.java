package Programmers;

import java.util.stream.Stream;

class NumOfPrime {
    int numberOfPrime(int n) {
        return (int)Stream.iterate(1, t -> t + 1)
                .limit(n)
                .filter(t -> {
                    for (int i = 2; i < t; i++) {
                        if (t % i == 0)
                            return false;
                    }
                    return true;
                })
                .count() - 1;
    }

    public static void main(String[] args) {
        NumOfPrime prime = new NumOfPrime();
        System.out.println( prime.numberOfPrime(707) );
    }

}