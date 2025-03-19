package interf;

public class Iphon10 implements Music,Telephone,Camera, Calculator{
    @Override
    public void calculate() {
        System.out.println("calculate");

    }

    @Override
    public void takepictures() {
        System.out.println("Pictures");

    }

    @Override
    public void playmusic() {
        System.out.println("Music");

    }

    @Override
    public void receviecall() {

    }

    @Override
    public void makecall() {

    }

    @Override
    public void sendtext() {

    }
}
