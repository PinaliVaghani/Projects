package Inheritance;

public class Truck extends Vehicle{
    @Override
    public void start() {
        System.out.println("Truck starts");
    }

    @Override
    public void brake() {
        System.out.println("Truck brakes");
    }

    public void useofTruck() {
        System.out.println("Used to Transfer loads ");
    }

    public boolean runonroads(){
        return true;
    }
}
