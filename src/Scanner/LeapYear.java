package Scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:-");
        int a = sc.nextInt();
        if (a % 4 == 0){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not leap year");
        }
    }
}
