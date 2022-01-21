import java.util.Scanner;

public class lesson4 {

    public static final char EMPTY = ' ';
    public static final char KREST = 'X';
    public static final char NOLIK = 'O';

    public static void main(String[] args) {
        int gameType;
        int fieldSize;
        int lastTurnX;
        int lastTurnY;
        boolean win;
        String turn1, turn2;
        String[] split;
        gameType = changeGame();
        fieldSize = getFieldSize(gameType);
        char[][] turns = new char[fieldSize][fieldSize];
        turns = fillTurns(fieldSize, turns);
        printField(fieldSize, turns);


        while (true) {
            turn1 = playerTurn(fieldSize, turns, 1);
            split = turn1.split(" ");
            turns[Integer.parseInt(split[1]) - 1][Integer.parseInt(split[0]) - 1] = KREST;
            if (checkWin(fieldSize, turns, Integer.parseInt(split[1]) - 1, Integer.parseInt(split[0]) - 1, KREST))
                break;
            printField(fieldSize, turns);
            turn2 = player2Turn(fieldSize, gameType, turns);
            split = turn2.split(" ");
            turns[Integer.parseInt(split[1]) - 1][Integer.parseInt(split[0]) - 1] = NOLIK;
            if (checkWin(fieldSize, turns, Integer.parseInt(split[1]) - 1, Integer.parseInt(split[0]) - 1, NOLIK))
                break;
            printField(fieldSize, turns);
        }

    }

    private static boolean checkWin(int fieldSize, char[][] turns, int x, int y, char symbol) {
        int points; //количество очков для победы
        int currentPoints = 0; // текущее число очков победы
        int[][] lines = {
                {-1, -1, 1, 1},
                {0, -1, 0, 1},
                {-1, 1, 1, -1},
                {-1, -1, 1, 0}
        };
        switch (fieldSize) {
            case 3:
                points = 3;
                break;
            case 4:
            case 5:
                points = 4;
                break;
            default:
                points = 5;
                break;
        }

        currentPoints = checkLine(x, y, turns, symbol, lines[0]);
        if (extracted(fieldSize, turns, points, currentPoints)) return true;
        currentPoints = checkLine(x, y, turns, symbol, lines[1]);
        if (extracted(fieldSize, turns, points, currentPoints)) return true;
        currentPoints = checkLine(x, y, turns, symbol, lines[2]);
        if (extracted(fieldSize, turns, points, currentPoints)) return true;
        currentPoints = checkLine(x, y, turns, symbol, lines[3]);
        if (extracted(fieldSize, turns, points, currentPoints)) return true;


        return false;
    }

    private static boolean extracted(int fieldSize, char[][] turns, int points, int currentPoints) {
        if (currentPoints >= points) {
            printField(fieldSize, turns);
            endGame();
            return true;
        }
        return false;
    }

    private static int checkLine(int x, int y, char[][] turns, char symbol, int[] line) {
        int cooX = x;
        int cooY = y;
        int currentPoints = -1;
        while (cooX >= 0 && cooY >= 0 && cooX < turns.length && cooY < turns.length) {
            System.out.println(cooX);
            System.out.println(cooY);
            if (turns[cooX][cooY] == symbol)
                currentPoints++;
            cooX += line[0];
            cooY += line[1];
        }

        cooX = x;
        cooY = y;
        while (cooX >= 0 && cooY >= 0 && cooX < turns.length && cooY < turns.length) {
            if (turns[cooX][cooY] == symbol)
                currentPoints++;
            cooX += line[2];
            cooY += line[3];
        }
        return currentPoints;
    }

    private static void endGame() {
        System.out.println("ПОБЕДА!!!");
    }

    private static char[][] fillTurns(int fieldSize, char[][] turns) {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                turns[i][j] = EMPTY;
            }
        }
        return turns;
    }

    private static String player2Turn(int fieldSize, int gameType, char[][] turns) {

        switch (gameType) {
            case 1:
                return playerTurn(fieldSize, turns, 2);
            case 2:
                return compEasyTurn(fieldSize, turns);
            case 3:
                return compEasyTurn(fieldSize, turns);
            default:
                return playerTurn(fieldSize, turns, 2);
        }
    }

    private static String compHardTurn(int fieldSize) {
        return "";
    }

    private static String compEasyTurn(int fieldSize, char[][] turns) {
        int cooX;
        int cooY;

        do {
            cooX = 1 + (int) (Math.random() * (fieldSize));
            cooY = 1 + (int) (Math.random() * (fieldSize));
        } while (turns[cooX - 1][cooY - 1] != EMPTY);
        System.out.printf("Компьютер сделал ход %d %d", cooX, cooY);
        System.out.println();
        return cooY + " " + cooX;
    }

    private static String human2Turn(int fieldSize) {
        Scanner inp = new Scanner(System.in);
        return inp.nextLine();
    }

    private static String playerTurn(int fieldSize, char[][] turns, int numberPlayer) {
        Scanner inp = new Scanner(System.in);
        String coo;
        int cooX;
        int cooY;
        int pass = 0;

        do {
            System.out.printf("Игрок %d, сделайте ход на незанятое поле", numberPlayer);
            System.out.println();
            System.out.println("Нужно ввести координаты крестика через пробел");
            coo = inp.nextLine();
            cooY = tryParseInt(coo.split(" ")[0], pass);
            cooX = (cooY != -1 && !coo.equals(String.valueOf(cooY))) ? tryParseInt(coo.split(" ")[1], pass) : pass;
        } while (cooX <= pass || cooY <= pass || cooX > fieldSize || cooY > fieldSize || turns[cooX - 1][cooY - 1] != EMPTY);
        return coo;
    }

    public static int tryParseInt(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }

    /**
     * @param gameType
     * @return
     */
    private static int getFieldSize(int gameType) {
        Scanner inp = new Scanner(System.in);
        printMenuSizeField();
        while (!inp.hasNextInt()) {
            printMenuSizeField();
            inp.nextLine();
        }
        return inp.nextInt();
    }

    /**
     * Выбираем тип игры
     *
     * @return вернет тип игры
     */
    private static int changeGame() {
        Scanner inp = new Scanner(System.in);

        while (true) {
            printMenu();
            switch (inp.next()) {
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                default:
                    break;
            }
        }
    }

    /**
     * Рисуем поле
     *
     * @param fieldSize
     * @param turns
     */
    private static void printField(int fieldSize, char[][] turns) {
        int size = fieldSize * 2 + 1;
        char symbol;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                symbol = getSymbol(i, j, size, turns);
                if (symbol == ' ')
                    System.out.print(turns[convertCell(i)][convertCell(j)]);
                else
                    System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static int convertCell(int i) {
        return (i - 1) / 2;
    }


    private static char getSymbol(int i, int j, int size, char[][] turns) {
        if (i % 2 == 0) {
            if (j % 2 == 0 && i != 0 && i != size - 1 && j != 0 && j != size - 1) return '┼';
            if (j % 2 == 0 && i != 0 && i != size - 1) return '│';
            if (i == 0 && j == 0) return '┌';
            if (j + i == size - 1 && j > i) return '┐';
            if (j + i == size - 1 && i > j) return '└';
            if (j == i && j == size - 1) return '┘';
            if (j % 2 == 0 && i == 0) return '┬';
            if (j % 2 == 0 && i == size - 1) return '┴';
            return '─';
        }
        if (j % 2 == 0) return '│';
        return ' ';
    }

    /**
     * Рисуем меню игры
     */
    private static void printMenu() {
        System.out.println("┌───────────────────────────────┐");
        System.out.println("│    Игра в крестики нолики     │");
        System.out.println("│    Выберите вариант игры:     │");
        System.out.println("│                               │");
        System.out.println("│ 1.Вдвоем на одной компьютере  │");
        System.out.println("│ 2.С АИ (простой уровень)      │");
        System.out.println("│ 3.С АИ (hard - в разработке)  │");
        System.out.println("│                               │");
        System.out.println("└───────────────────────────────┘");
    }

    /**
     * Спрашиваем про размер поля,если тип игры 1 или 3
     */
    private static void printMenuSizeField() {
        System.out.println("┌───────────────────────────────┐");
        System.out.println("│    Игра в крестики нолики     │");
        System.out.println("│     Введите размер поля:      │");
        System.out.println("│         (целое число)         │");
        System.out.println("└───────────────────────────────┘");
    }

}
