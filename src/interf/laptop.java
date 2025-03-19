package interf;

public class laptop implements Clock,Music , Calculator{

    @Override
    public void calculate() {

    }

    @Override
    public void showtime() {
        System.out.println("Time");

    }

    @Override
    public void Timer() {
        System.out.println("10 min to left");

    }

    @Override
    public void setalarm() {

    }

    @Override
    public void playmusic() {

    }
}
