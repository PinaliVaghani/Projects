public class BreakAndContinue {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        for (a = 1; a <= 100; a++) {
            if ((a % 5) == 0) {
                continue;
            }
            else  {
                System.out.println(a);
            }
        }
    }
}




