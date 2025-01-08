package Inheritance;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Full Time");
        System.out.println("2. Contract ");
        System.out.println("3. Part-time");
        String input;
        String next = "NEXT";
        do {
            System.out.print("Enter the number to fill form:-");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    FullTime fullTime1 = new FullTime();
                    fullTime1.fulltime();
                    break;
                case 2:
                    Contract contract1 = new Contract();
                    contract1.contract();
                    break;
                case 3:
                    PartTime parttime1 = new PartTime();
                    parttime1.parttime();
                    break;
                default:
                    System.out.print("Enter number between 1 to 3");
            }
            System.out.print("Enter 'Next' for next employee:");
            input = sc.next();


        } while (input== "Next" && input== "next");
    }
}
