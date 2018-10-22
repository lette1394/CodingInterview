package Practice;

public class RaceHorse extends Horse {
    public int speed;
    public int value;

    private int weight;

    public RaceHorse(String name) {
        super(name);
    }

    public void winRace() {
        System.out.println();
        System.out.println(this.name + " is WIN!");
    }
}