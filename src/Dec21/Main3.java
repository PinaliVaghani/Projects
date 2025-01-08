package Dec21;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Reversed array: " + Arrays.toString(arr));
        Reverse reverse = new Reverse();
        int[] reverseelement = reverse.reverseArray(arr);
    }


}
