public class Buyer {
    public static void main(String[] args) {
        Vehicle cycle = VehicleFactory.getVehicle("Cycle");

        cycle.assignColor("Galaxy blue");
        cycle.startEngine();

        cycle.assignColor("Passion red");
        cycle.startEngine();

        Vehicle truck = VehicleFactory.getVehicle("Truck");
        truck.assignColor("Silver gray");
        truck.startEngine();

        Vehicle tucsonTruck = VehicleFactory.getVehicle("Truck"); // this object has not been created.
        tucsonTruck.assignColor("Dessert gold");
        tucsonTruck.startEngine();

    }
}
