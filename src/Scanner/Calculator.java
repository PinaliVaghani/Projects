package Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("Welcome to calculator");
        System.out.println("*********************");
        char input;

        do {
            System.out.println("1. Additon");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Divison");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            System.out.println("Enter the number :-");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Enter the First Value:");
                    int a = sc.nextInt();
                    System.out.println("Enter the second value:");
                    int b = sc.nextInt();
                    int c = a + b;
                    System.out.println("Addition " + c);
                    break;
                case 2:
                    System.out.println("Enter the First Value:");
                    int d = sc.nextInt();
                    System.out.println("Enter the second value:");
                    int e = sc.nextInt();
                    int f = d - e;
                    System.out.println("Subtraction " + f);
                    break;
                case 3:
                    System.out.println("Enter the First Value:");
                    int g = sc.nextInt();
                    System.out.println("Enter the second value:");
                    int h = sc.nextInt();
                    int l = g * h;
                    System.out.println("Multiplication " + l);
                    break;
                case 4:
                    System.out.println("Enter the First Value:");
                    double k = sc.nextDouble();
                    System.out.println("Enter the second value:");
                    double n = sc.nextDouble();
                    double m = k / n;
                    System.out.println("Divison " + m);
                    break;
                case 5:
                    System.out.println("Enter the First Value:");
                    double x = sc.nextDouble();
                    System.out.println("Enter the second value:");
                    double y = sc.nextDouble();
                    double z = x % y;
                    System.out.println("Modulus " + z);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong number");


            }
            System.out.println("Do still want to continue yes 'y' or no 'n':");
            input = sc.next().charAt(0);


        }while (input == 'Y' || input == 'y') ;
    }
}










