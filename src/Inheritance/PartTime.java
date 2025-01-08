package Inheritance;

import java.util.Scanner;

public class PartTime extends Employee{
    Scanner sc = new Scanner(System.in);


    public void parttime(){
        System.out.println("Parttime");
        System.out.print("Enter your name:-");
        String d = sc.next();
        System.out.print("Enter your age:-");
        int e = sc.nextInt();
        System.out.print("Enter the working hours:-");
        int a = sc.nextInt();
        System.out.print("Enter the Hourly payrate:-");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Salary is " + c);

    }
}

