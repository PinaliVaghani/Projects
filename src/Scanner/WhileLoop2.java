package Scanner;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        while(z < a){
            System.out.println(x + " ");
            int b = x + y;
            x = y;
            y = b;
            z ++;
        }
    }
}
