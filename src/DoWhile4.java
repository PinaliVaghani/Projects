import java.util.Scanner;

public class DoWhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int y = 1;
        do{
            System.out.println(x + "*" + y + "="+ x * y );
            y ++;
        }while(y <= 10);
    }
}
