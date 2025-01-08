package Dec21;

public class Minimum {
    public static void main(String[] args) {
        int[] numbers = {100, 120, 300, 40, 50, 160, 370, 180, 190};

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The minimum number is: " + min);
    }
}
