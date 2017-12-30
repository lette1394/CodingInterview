package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong" , 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result = getStudentByName(persons, "jack");
        System.out.println(result);

        Person result1 = persons.stream()
                .filter(x -> "mkyong".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "dkk".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

        System.out.println(
                persons.stream()
                .filter(p -> "jack".equals(p.getName()) && p.getAge() == 20)
                .findAny()
                .orElse(null)
        );

        System.out.println(
                persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("none")
        );

        System.out.println(
                persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList())
        );


    }

    public static Person getStudentByName(List<Person> persons, String filter) {
        Person res = null;

        for (Person temp : persons) {
            if (filter.equals(temp.getName())) {
                res = temp;
            }
        }

        return res;
    }


}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
