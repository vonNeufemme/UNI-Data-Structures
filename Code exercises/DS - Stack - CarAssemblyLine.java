package Stack;

import java.util.Iterator;
import java.util.LinkedList;

// In fact, this assignment deals with integers only,
// so it is not absolutely necessary to enclose the int's in Car object, but just for fun. 

class Car {

    int value;

    Car (int value) {
        this.value = value;
    }

}


public class CarAssemblyLine {

    LinkedList<Car> batchList;

    CarAssemblyLine() {
        this.batchList = new LinkedList<Car>();
    }

    void pushBatch(int num) {

        // get the value of input car
        // initialise a next car and pass in the value of the previous car.
        int value = num;

        Iterator<Car> iter = batchList.iterator();

        System.out.println("============== INSPECTION BATCH LIST ==============");
        System.out.println("Inspection REQUIRED");

        for (int i=0; i<3; i++) {
            Car car = new Car(value + 1);
            this.batchList.push(car);
            value += 1;
            System.out.println("Car ID: " + car.value);
        }

        System.out.println("============== END OF LIST ==============");
        System.out.println("");
    }

    void popCar() {
        Car popped = this.batchList.pop();
        System.out.println("Car ID: " + popped.value + " Inspection Completed");
    }

    void popCar(Car car) {
        this.batchList.remove(car);
    }


    public static void main(String[] args) {

        // Initialise assembly line
        CarAssemblyLine AssemblyLine = new CarAssemblyLine();

        // Manufacture the first car for the batch list
        Car car = new Car(0);

        // Start the assembly line and the batch
        AssemblyLine.pushBatch(0);

        for (int i=0; i<3; i++) {
            AssemblyLine.popCar();
        }

    }

}


/*
============== INSPECTION BATCH LIST ==============
Inspection REQUIRED
Car ID: 1
Car ID: 2
Car ID: 3
============== END OF LIST ==============

Car ID: 3 Inspection Completed
Car ID: 2 Inspection Completed
Car ID: 1 Inspection Completed
*/
