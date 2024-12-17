package Scanner;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number:-");
        int a = sc.nextInt();
        System.out.println("Enter the b number:-");
        int b = sc.nextInt();
        System.out.println("Enter the c number:-");
        int c  = sc.nextInt();
        if (a > c && a> b){
            System.out.println("the number a is greater");
        }
        else if (b > a ){
            System.out.println("the number b is greater");
        }
        else{
            System.out.println("the number is c is greater");
        }


    }
}


