public class lesson9 {

    public static void main(String[] args) {

        String[][] arr1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "5", "4"},
                {"1", "5", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] arr2 = {
                {"2", "4", "1", "1"},
                {"5", "2", "3", "1"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println(arrString(arr1));
            System.out.println(arrString(arr2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int arrString(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int ii = 0;
        if (arr.length != 4 || arr[0].length != 4)
            throw new MyArraySizeException("Число строк и столбцов массива должны быть 4");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    ii = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент " + i + " " + j + " не число");
                } finally {
                    sum += ii;
                }
            }

        }
        return sum;
    }

}
