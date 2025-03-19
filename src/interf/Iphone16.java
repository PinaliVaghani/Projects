package interf;

public class Iphone16 implements Music,Telephone,Camera, Calculator, AI{
    @Override
    public void voicetotext() {
        System.out.println("hey siri");

    }

    @Override
    public void drawfromvoice() {

    }

    @Override
    public void calculate() {

    }

    @Override
    public void takepictures() {

    }

    @Override
    public void playmusic() {

    }

    @Override
    public void receviecall() {
        System.out.println("recive call");

    }

    @Override
    public void makecall() {
        System.out.println("make call");

    }

    @Override
    public void sendtext() {

    }
}
