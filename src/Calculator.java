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
                    Calculator calculator = new Calculator();
                    calculator.sum();

                    break;
                case 2:



                    break;
                case 3:


                    break;
                case 4:


                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong number");


            }
            System.out.println("Do still want to continue yes 'y' or no 'n':");
            input = sc.next().charAt(0);


        } while (input == 'Y' || input == 'y');
    }
    public void sum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Value:");
        int a = sc.nextInt();
        System.out.println("Enter the second value:");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition " + c);


    }
}







