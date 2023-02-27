package HarmonikOrt;

import java.util.Arrays;

public class tekraredensayilar {

    static boolean isRepeat(int[] arr, int value) {
        for (int x : arr) {
            if (x == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {8, 5, -5, 90, 21, 5, 8, -2, 8, 20, 5};
        int[] duplicate = new int[list.length];
        int startindex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (isRepeat(duplicate, list[i])) {
                            duplicate[startindex++] = list[i];
                        }
                    }


                }
            }
        }

        System.out.println(Arrays.toString(duplicate) + "\n" + "Tekrar eden sayılar:");
        for (int a : duplicate) {
            if (a != 0) {
                System.out.println(a);
            }
        }

    }
}
