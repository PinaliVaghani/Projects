package Dec21;

public class Maximum {
       // int[] numbers = {100, 120, 300, 40, 50, 160, 370, 180, 190};
public int FindMax(int[] numbers){
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("The maximum number is: " + max);
            return max;

    }
}

