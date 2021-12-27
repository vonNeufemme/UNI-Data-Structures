import java.util.HashMap;

public class VehicleFactory {
    // provides a particuler vehicle.

    private static HashMap<String, Vehicle> hashMap = new HashMap<String, Vehicle>();

    public static Vehicle getVehicle(String type) {
        Vehicle v = null;
        if (hashMap.containsKey(type)){
            v = hashMap.get(type);
        }
        else {
            switch (type) {
                case "Cycle":
                    System.out.println("Cycle has been created");
                    v = new Cycle();
                    break;
                case "Truck":
                    System.out.println("Truck has been created");
                    v = new Truck();
                    break;
                default:
                    throw new IllegalArgumentException("Vehicle " + type + " does not exist");
            }
            hashMap.put(type, v);
        }
        return v;
    }
}
