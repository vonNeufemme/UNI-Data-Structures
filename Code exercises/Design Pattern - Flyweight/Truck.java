public class Truck implements Vehicle {

    private final String MAXSPEED; // intrinsic property
    private String color;          // extrinsic property    // set by the user or client

    Truck() {
        MAXSPEED = "120 km/hr";
    }

    @Override
    public void assignColor(String color) {
        this.color=color;
    }

    @Override
    public void startEngine() {
        System.out.println(color + " coloured Truck with max speed " + MAXSPEED);
    }
}
