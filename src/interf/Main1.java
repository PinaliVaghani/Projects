package interf;

public class Main1 {
    public static void main(String[] args) {
        Iphon10 iphone10 = new Iphon10();
        iphone10.calculate();
        iphone10.playmusic();
        iphone10.takepictures();


         Iphone16 iphone16 = new Iphone16();
         iphone16.voicetotext();
         iphone16.makecall();
         iphone16.receviecall();



         laptop laptop = new laptop();
         laptop.Timer();
         laptop.showtime();
    }
}
