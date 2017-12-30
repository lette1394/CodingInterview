package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ComparableTest{
    public static void main(String[] args) {
        String[] fruits = new String[] {"Pinapple", "Apple", "Orange", "Banana", "Grape"};

        Arrays.sort(fruits);

//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        Fruit[] fruits1 = new Fruit[5];
        fruits1[0] = new Fruit("Pineapple", 70);
        fruits1[1] = new Fruit("Apple", 30);
        fruits1[2] = new Fruit("Orange", 35);
        fruits1[3] = new Fruit("Banana", 50);
        fruits1[4] = new Fruit("Grape", 20);

        Arrays.sort(fruits1);

        for (Fruit fruit : fruits1) {
            System.out.println(fruit.getName() + fruit.getPrice());
        }

        System.out.println("------------");

        Arrays.sort(fruits1, Comparator.comparing(Fruit::getName));

        Stream.of(fruits1).forEach(x -> System.out.println(x.getName() + x.getPrice()));
        Arrays.stream(fruits1).sorted(Comparator.comparingInt(Fruit::getPrice)).forEach(x -> System.out.println(x.getPrice()));
    }


}


class Fruit implements Comparable {
    private String name;
    private int price;
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object compareFruit) {
        int comparePrice = ((Fruit)compareFruit).getPrice();

        return this.price - comparePrice;
    }
}