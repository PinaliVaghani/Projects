package Dec21;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = new String[5];

        System.out.println("Enter names of 5 fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            fruits[i] = scanner.nextLine();
        }

    }
}

