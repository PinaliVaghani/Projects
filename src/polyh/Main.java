package polyh;

public class Main extends Car{
    public static void main(String[] args) {
        Car gasoline = new Gasoline("Toyota", "Camry", 25000);
        Car diesel = new Diesel("Ford", "Ranger", 35000);
        Car electric = new Electric("Tesla", "CyberTruck", 79999);


        gasoline.printDetails();
        diesel.printDetails();
        electric.printDetails();
    }
}

