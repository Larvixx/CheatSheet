package Practicum.Arrays;

import java.util.Arrays;

public class поискВ_Массиве {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int arrayCopy[] = Arrays.copyOfRange(array, 0, array.length);
        Arrays.sort(arrayCopy);
        boolean result;
        if (Arrays.binarySearch(arrayCopy, element) >= 0) {
            result = true;
            System.out.println(result);
        } else {
            result = false;
            System.out.println(result);
        }
    }
}
