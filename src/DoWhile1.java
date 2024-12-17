public class DoWhile1 {
    public static void main(String[] args) {
        int w = 10;
        int x = 0;
        int y = 1;
        int z = 0;
        do{
            System.out.println(x + " ");
            int a = x + y;
            x =y;
            y = a;
            z ++;
        }while (z <= 10);
    }
}
