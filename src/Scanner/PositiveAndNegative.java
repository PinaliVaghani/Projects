package Scanner;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:-");
        int a = sc.nextInt();
        if (a > 0){
            System.out.println("the number is positive");
        }
        else {
            System.out.println("the number is negative");
        }

    }
}
