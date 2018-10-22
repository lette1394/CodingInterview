package Practice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public void sound() {
        System.out.println("IM TEST! ON PRACTICE");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.sound();

        List<Soundable> list = new ArrayList<>();

        list.add(new Man());
        list.add(new Man());
        list.add(new Woman());
        list.add(new Man());
        list.add(new Woman());
        list.add(new Woman());
//        list.add(new Frog());


        for (Soundable s : list) {
            ((Speakable)s).speak();
        }
    }
}

class Man implements Speakable {
    public String name;

    @Override
    public void sound() {
        System.out.println("Mmmmmmm");
    }

    public void speak() {
        System.out.println("IM MAN");
    }
}

class Woman implements Speakable {

    @Override
    public void sound() {
        System.out.println("Wwwwwwww");
    }

    public void speak() {
        System.out.println("IM WOMAN");
    }
}

class Frog implements Soundable {
    @Override
    public void sound() {
        System.out.println("Grrrrrrrrrrr...");
    }
}

interface Soundable {
    public void sound();
}

interface Speakable extends Soundable {
    public void speak();
}