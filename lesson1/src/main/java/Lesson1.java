public class Lesson1 {

    float a, b, c, d = 0;
    int i = 5;
    int i2 = 7;

    public static void main(String[] args) {

        int year = 2000;
        boolean checkYear;

        checkYear = getEx8(year);
        System.out.printf("год %d %s", year, getYear(checkYear));
    }

    /**
     * Метод вычисляет выражение a * (b + (c/d))
     *
     * @param b Число с плавающей точкой
     * @param c Число с плавающей точкой
     * @param d Число с плавающей точкой
     * @param a Число с плавающей точкой
     * @return возвращает результат
     */
    public static float getEx3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /**
     * принимает на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно)
     *
     * @param a Число
     * @param b Число
     * @return true, в противном случае – false.
     */
    public static boolean getEx4(int a, int b) {
        return (a + b >= 10 && a + b <= 20) ? true : false;
    }

    /**
     * Метод проверяет положительное или отрицательное число передалось
     *
     * @param a
     * @return возвращает текст
     */
    public static String getEx5(int a) {
        return (a >= 0) ? "Число положительное" : "Число отрицательное";
    }

    /**
     * проверяет положительное или отрицательное число передалось
     *
     * @param a
     * @return true/false
     */
    public static Boolean getEx6(int a) {
        return (a >= 0) ? true : false;
    }

    /**
     * Метод принимает имя
     *
     * @param name - Строка
     * @return возвращает приветствие
     */
    public static String getEx7(String name) {
        return String.valueOf(System.out.printf("Привет, %/s!", name));
    }

    /**
     * Метод принимает год
     *
     * @param year
     * @return возвращает true/false  в зависимости от того ,високосный год , или нет
     */
    public static boolean getEx8(int year) {
        boolean ask = false;
        if (year % 4 == 0)
            ask = true;
        if (year % 100 == 0)
            ask = false;
        if (year % 400 == 0)
            ask = true;
        return ask;
    }

    public static String getYear(boolean b) {
        if (b)
            return "Год високосный";
        else
            return "Год не високосный";
    }
}
