package jan18;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Grass");

    }

    @Override
    public void Voice() {
        System.out.println("Bark");

    }

    @Override
    public void colour() {
        System.out.println("Golden");

    }
}
