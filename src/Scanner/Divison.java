package Scanner;

import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number:-");
        double b = sc.nextDouble();
        double c = a / b;
        System.out.println("Divison is "+c);

    }
}
