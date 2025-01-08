package Dec21;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Countries = new String[5];

        System.out.println("Enter names of 5 fruits:");
        for (int i = 0; i < Countries.length; i++) {
            System.out.print("Enter countries " + (i + 1) + ": ");
            Countries[i] = scanner.nextLine();
        }

    }
}
