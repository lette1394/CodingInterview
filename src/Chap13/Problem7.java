package Chap13;

import java.util.Arrays;
import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country("asia", 100),
                new Country("asia", 200),
                new Country("america", 300),
                new Country("america", 400),
                new Country("africa", 500),
                new Country("europe", 600),
                new Country("asia", 700),
                new Country("asia", 800)
        );

        System.out.println("asia : " + Country.getPopulation(countries, "asia"));
        System.out.println("america : " + Country.getPopulation(countries, "america"));

    }
}

class Country {
    private String continent;
    private int population;

    Country(String continent, int population) {
        this.continent = continent;
        this.population = population;
    }

    static int getPopulation(List<Country> countries, String continent) {
        return countries
                .stream()
                .filter(country -> country.continent.equals(continent))
                .mapToInt(a -> a.population)
                .sum();
    }
}