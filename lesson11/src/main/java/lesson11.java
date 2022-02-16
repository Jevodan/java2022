import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class lesson11 {
    public static void main(String[] args) {

        String[] arr1 = {"ааа", "ббб"};
        Integer[] arr2 = {1, 2};
        invertTo(arr1);
        invertTo(arr2);
        for (String s : arr1) System.out.println(s);
        for (Integer integer : arr2) System.out.println(integer);

        List<String> arrS = invertToList(arr1);
        List<Integer> arrI = invertToList(arr2);

    }

    // Задание 2
    private static <T> List<T> invertToList(T[] arr1) {
        return Arrays.asList(arr1);
    }

    // Задание 1
    private static <T> void invertTo(T[] arr1) {
        T val = arr1[0];
        arr1[0] = arr1[1];
        arr1[1] = val;
    }


}


