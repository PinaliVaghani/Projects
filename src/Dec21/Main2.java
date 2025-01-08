package Dec21;

import jdk.nashorn.internal.runtime.FindProperty;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Maximum max = new Maximum();
        int Maximum = max.FindMax(numbers);
        System.out.println(" max is" + max);

    }

    }

