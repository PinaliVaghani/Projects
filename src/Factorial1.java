public class Factorial1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 1;
        for (int i = 1; i <= x ; i++){
            y *= i;
        }
        System.out.println("Factorial is: " + y );
    }
}
