package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Collections {
    public static void main(String[] args) {
        List<Product> list1 = new ArrayList<>();

        list1.add(new Product());
        list1.add(new Tv());
        list1.add(new Audio());

        printAll(list1);

        Person<EmployeeInfo, Integer> p1 = new Person<>(new EmployeeInfo(1), 1);
        Person p2 = new Person<>(new EmployeeInfo(2), 999);

        p1.printInfo(144);
        p2.printInfo(244);

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("1 2 3 4".replace(" ", "")));
        list.sort(String::compareTo);
    }

    static void printAll(List<? extends Product> list) {
        for (Product p : list) {
            System.out.println(p.getName());
        }
    }
}

abstract class Info {
    abstract int getLevel();
}
class EmployeeInfo extends Info {
    int rank;

    EmployeeInfo(int rank) {
        this.rank = rank;
    }

    int getLevel() {
        return this.rank;
    }
}

class Person<T extends Info, S> {
    T info;
    S id;

    Person(T info, S id) {
        this.info = info;
        this.id = id;
    }

    <U> void printInfo(U info) {
        System.out.println(info);
    }
}

class Product {
    String name;

    Product() {
        name = "this is Product";
    }

    String getName() {
        return name;
    }
}

class Tv extends Product {
    String name;

    Tv() {
        name = "this is Tv";
    }

    String getName() {
        return name;
    }
}

class Audio extends Product {
    String name;

    Audio() {
        name = "this is Audio";
    }

    String getName() {
        return name;
    }
}