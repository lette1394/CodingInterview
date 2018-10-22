package Practice;

class Phone {
    Phone() {

    }
}

public class Horse {
    public String name;
    protected int age;

    public void sound() {
        System.out.println("ㅎㅣ이이이이잉ㅇ");
    }

    public Horse(String name) {
        this.name = name;
    }

    Horse() {}

    static void f1_printName(Horse h1) {
        System.out.println(h1.name);
    }

    static void f2_printName(RaceHorse h2) {
        System.out.println(h2.name);
    }

    static RaceHorse g() {
        return new RaceHorse("ddddd");
    }

    public static void main(String[] args) {
        Horse h = new RaceHorse("my name is aaa");
        RaceHorse r = new RaceHorse("my name is bbb");

        f1_printName(r);
        h = g();

        Horse h1 = new RaceHorse("my name is ccc");
        Horse h2 = new Horse();

        f2_printName((RaceHorse)h1);
        f2_printName((RaceHorse)h2);

//        h.winRace();

        ((RaceHorse)h).winRace();
//        (RaceHorse)h.winRace();
    }
}

