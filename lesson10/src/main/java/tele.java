import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class tele {

    public static void main(String[] args) {

        HashMap<String, String> telebook = new HashMap<>();  // телефонная книга
        Scanner in;
        int num = 0;
        generateTeleBook(telebook);
        menu();
        while (num != 3) {
            try {
                in = new Scanner(System.in);
                num = in.nextInt();
            } catch (InputMismatchException e) {
                e.getMessage();
            }
            switch (num) {
                case 1:
                    String[] dat = addAb();
                    telebook.put(dat[0], dat[1]);
                    menu();
                    break;
                case 2:
                    searchAb(telebook);
                    menu();
                    break;
                case 3:
                    exit();
                    break;
            }
        }
    }

    private static void generateTeleBook(HashMap<String, String> telebook) {
        telebook.put("7920456789", "Alex");
        telebook.put("7920456589", "Aleksei");
        telebook.put("7920456289", "Alina");
        telebook.put("7920456749", "Anna");
        telebook.put("7920456739", "Abba");
        telebook.put("7920456719", "Alla");
        telebook.put("7920456119", "Alisa");
        telebook.put("7930456719", "Alla");
    }


    private static void searchAb(HashMap<String, String> telebook) {
        Scanner in = new Scanner(System.in);
        String fio;
        System.out.println("Введите имя:");
        fio = in.next();
        for (Map.Entry<String, String> o : telebook.entrySet()) {
            if (o.getValue().equals(fio))
                getInfo(o);
        }
    }

    private static void getInfo(Map.Entry<String, String> o) {
        System.out.printf(" Имя: %s  Телефон: %s", o.getValue(), o.getKey());
        System.out.println();
    }

    private static String[] addAb() {
        Scanner in;
        String[] data = new String[2];
        in = new Scanner(System.in);
        System.out.println("Введите имя:");
        data[1] = in.next();
        System.out.println("Введите телефон:");
        data[0] = in.next();
        return data;
    }

    private static void menu() {
        System.out.println("***********************************************");
        System.out.println("*             Телефонная книга                *");
        System.out.println("*   1. Добавить абонента                      *");
        System.out.println("*   2. Найти абонента                         *");
        System.out.println("*   3. Выход                                  *");
        System.out.println("***********************************************");
    }
}
