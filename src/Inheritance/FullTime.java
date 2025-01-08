package Inheritance;

import java.util.Scanner;

public class FullTime extends Employee {
    Scanner sc = new Scanner(System.in);



    public void fulltime() {
        System.out.println("Full Time");
        System.out.print("Enter your name:-");
        String a = sc.next();
        System.out.print("Enter your age:-");
        int c = sc.nextInt();
        System.out.print("Enter your salary:-");
        int e = sc.nextInt();
    }


}
