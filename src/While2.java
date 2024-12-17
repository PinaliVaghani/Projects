public class While2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 1;
        int z = 0;
        int num = 0;
        while(num < x){
            System.out.println(z +" ");
            int a = y + z;
            z = y;
            y = a;
            num++;
        }
    }
}
