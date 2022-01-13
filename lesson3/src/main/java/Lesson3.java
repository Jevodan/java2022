import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

    static String[] words = {
            "apple",
            "orange",
            "lemon",
            "banana",
            "apricot",
            "avocado",
            "broccoli",
            "carrot",
            "cherry",
            "garlic",
            "grape",
            "melon",
            "leak",
            "kiwi",
            "mango",
            "mushroom",
            "nut",
            "olive",
            "pea",
            "peanut",
            "pear",
            "pepper",
            "pineapple",
            "pumpkin",
            "potato"
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String food = "";
        String wordFromAI = getRandomWord(words);
        System.out.println("Компьютер загадал слово, попробуй угадать \n");
        System.out.println(wordFromAI);
        do {
            food = sc.next().toLowerCase();
            System.out.println(getCompare(wordFromAI, food));
            System.out.println((getAnswer(wordFromAI, food)) ? "Ответ верен" : "Ответ неверен");
            sc.nextLine();
        } while (!wordFromAI.equals(food));
    }

    private static boolean getAnswer(String word1, String word2) {
        return word1.equals(word2);
    }

    /**
     * Метод вернет новую строку с подсказками в виде букв на своих местах, либо слово,если оно угадано
     *
     * @param word1 - Слово, загаданное компьютером
     * @param word2 - Слово, введенное человеком
     * @return String
     */
    private static String getCompare(String word1, String word2) {
        if (word1.equals(word2)) return word2;
        String str = (word1.length() > word2.length()) ? word2 : word1;
        String newWord = "";
        for (int i = 0; i < str.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i))
                newWord = newWord.concat(String.valueOf(word1.charAt(i)));
            else
                newWord = newWord.concat("#");
        }
        return newWord + "###############";
    }

    /**
     * Метод возвращает случайное слово из массива
     *
     * @return Случайное слово из массива
     */
    private static String getRandomWord(String[] arr) {
        int n = (int) Math.floor(Math.random() * arr.length);
        return arr[n];
    }
}
