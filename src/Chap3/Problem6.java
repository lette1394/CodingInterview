package Chap3;


import java.util.Iterator;
import java.util.LinkedList;

public class Problem6 {
    private LinkedList<Animal> list = new LinkedList<>();

    public void enqueue(Animal animal) {
        list.add(animal);
    }

    public Animal dequeueAny() {
        return list.removeFirst();
    }

    public Dog dequeueDog() {
        Iterator<Animal> iter = list.iterator();
        Animal result = null;

        while (iter.hasNext()) {
            result = iter.next();

            if (result instanceof Dog) {
                iter.remove();
                break;
            }
        }

        return (Dog)result;
    }

    public Cat dequeueCat() {
        Iterator<Animal> iter = list.iterator();
        Animal result = null;

        while (iter.hasNext()) {
            result = iter.next();

            if (result instanceof Cat) {
                iter.remove();
                break;
            }
        }

        return (Cat)result;
    }
}

abstract class Animal {
    String name;
    int age;

    abstract void greeting();
}

class Dog extends Animal {
    @Override
    void greeting() {
        System.out.println("Dog!");
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }

    Dog(int age) {
        this.age = age;
    }
}

class Cat extends Animal {
    @Override
    void greeting() {
        System.out.println("Cat!");
    }
}
