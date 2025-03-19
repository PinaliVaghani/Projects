package jan18;

import java.util.concurrent.Callable;

public class Main2 {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Dog.Voice();
        Dog.eat();


        Animal Cat = new Cat();
        Cat.Voice();
        Cat.colour();


        Animal Tiger = new Tiger();
        Tiger.eat();
        Tiger.colour();

    }
}
