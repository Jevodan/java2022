import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 0, 1, 1, 1};
        int[] arr2 = invertArr(arr);


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


    }

    /**
     * Метод инвертирует значения массива 1 в 0 и наоборот
     * @param array - входящий массив
     * @return - инвертируемый массив
     */
    public static int[] invertArr(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (array[i] == 1) ? 0 : 1;
        return array;
    }

}
