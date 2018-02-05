package Chap3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {
    Problem6 p = new Problem6();

    @Test
    public void test() {
        Dog dog1 = new Dog(1);
        Dog dog2 = new Dog(2);
        Dog dog3 = new Dog(3);
        Dog dog4 = new Dog(4);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        p.enqueue(dog1);
        p.enqueue(dog2);
        p.enqueue(cat1);
        p.enqueue(dog3);
        p.enqueue(cat2);
        p.enqueue(cat3);
        p.enqueue(dog4);
        p.enqueue(cat5);
        p.enqueue(cat4);

        assertEquals(dog1, p.dequeueAny());
        assertEquals(dog2, p.dequeueAny());

        assertEquals(cat1, p.dequeueCat());
        assertEquals(dog3, p.dequeueDog());
        assertEquals(dog4, p.dequeueDog());

        assertEquals(cat2, p.dequeueCat());

    }
}
