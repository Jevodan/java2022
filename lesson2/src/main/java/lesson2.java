import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 0, 1, 1, 1};
        int[] arr2 = invertArr(arr);
        int[] emptyEx_2 = new int[8];
        int[] fullEx_2 = getFullArr(emptyEx_2);
        int[] arrayEx_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrayNewEx_3 = getNewArr(arrayEx_3);
        int[][] arrayEx_4 = new int[9][9];
        int[][] arr4 = getDiagonal(arrayEx_4);
        int[] arrayLast = {1, 5, 3, 15, 2, 7, 7, 4, 5, 4, 5, 2, 4, 2, 5, 8, 9};


        // Выводим инвертируемый массив (Задание первое)
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        getNext();
        // Выводим заполненный массив (Задание второе)
        for (int i = 0; i < fullEx_2.length; i++) {
            System.out.print(fullEx_2[i] + " ");
        }
        getNext();
        // Выводим новый массив (Задание третье)
        for (int i = 0; i < arrayNewEx_3.length; i++) {
            System.out.print(arrayNewEx_3[i] + " ");
        }

        getNext();
        // Выводим новый массив (Задание четвертое)
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        getNext();
        System.out.println("Максимальное число заданного массива:" + getMax(arrayEx_3));
        System.out.println("Минимальное число заданного массива:" + getMin(arrayEx_3));

        getNext();
        System.out.println(getHalf(arrayLast));


    }

    private static boolean getHalf(int[] arrayLast) {
        int summ = 0;
        int halfSumm = 0;
        for (int el : arrayLast)
            summ += el;
        if (summ % 2 != 0)
            return false;
        for (int el : arrayLast) {
            halfSumm += el;
            if (halfSumm > summ / 2)
                break;
            if (halfSumm == summ / 2)
                return true;
        }
        return false;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            max = (max > array[i]) ? max : array[i];
        return max;
    }

    private static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
            min = (min < array[i]) ? min : array[i];
        return min;

    }

    public static void getNext() {
        System.out.println("");
        System.out.println("________________");
    }

    /**
     * Метод инвертирует значения массива 1 в 0 и наоборот
     *
     * @param array - входящий массив
     * @return - инвертируемый массив
     */
    public static int[] invertArr(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (array[i] == 1) ? 0 : 1;
        return array;
    }

    /**
     * Метод заполняет пустой массив определенными данными
     *
     * @param array - пустой массив
     * @return массив с данными
     */
    public static int[] getFullArr(int[] array) {
        for (int i = 1; i < array.length; i++)
            array[i] = array[i - 1] + 3;
        return array;
    }

    /**
     * Метод обрабатывает входящий массив согласно заданию 3 - элементы,меньшие 6, умножаем на 2
     *
     * @param array - входящий массив
     * @return - новый массив
     */
    public static int[] getNewArr(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (array[i] < 6) ? array[i] * 2 : array[i];
        return array;
    }

    public static int[][] getDiagonal(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j + value == array.length) array[i][j] = value;

            }
        }

        return array;
    }

}
