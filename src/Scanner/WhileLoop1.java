package Scanner;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = scanner.nextInt();
        int x = 1;
        while(x <= a){
            System.out.println(x + " ");
            x ++;
        }
    }
}
