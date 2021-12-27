public class Cycle implements Vehicle {

    private final String MAXSPEED;
    private String color;

    Cycle() { MAXSPEED = "120 km/hr"; }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println(color + " coloured Cycle with max speed " + MAXSPEED);
    }
}
