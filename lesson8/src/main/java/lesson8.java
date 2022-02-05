import classes.Barrier;
import classes.Personal;


public class lesson8 {

    private static final int NUMBER_PLAYERS = 10;  // Число участников марафона
    private static final int NUMBER_BARRIERS = 15; // Количествол преград
    private static final String[] types = {"Cat", "Robot", "Human"}; // Массив типов участвующих в забеге
    private static final String[] barriers = {"Road", "Wall"}; // Массив типов преград

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory(); // Класс фабрики, который имеет конвеер производства и персонажей и преград
        Personal[] creatures = new Personal[NUMBER_PLAYERS]; // Массив персонажей
        Barrier[] marafon = new Barrier[NUMBER_BARRIERS]; // Массив барьеров
        int randomIndex;
        /*       Заполняем массив персонажей         */
        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            randomIndex = (int) (Math.random() * types.length);
            creatures[i] = factory.createPers(types[randomIndex]);
        }

        System.out.println("Список участников марафона, победитель получает пожизненное право поворачивать направо с крайней левой полосы:");
        for (Personal creature : creatures) {
            creature.info();
        }

        /*       Заполняем массив препятсвий        */
        for (int i = 0; i < NUMBER_BARRIERS; i++) {
            randomIndex = (int) (Math.random() * barriers.length);
            marafon[i] = factory.createBarrier(barriers[randomIndex]);
        }

        System.out.println("*********************НАЧАЛО ГОНКИ!!!!!*************************");
        for (Barrier wall : marafon) {
            System.out.println("*********************СЛЕДУЮЩИЙ ЭТАП!!!!*************************");
            for (Personal creature : creatures) {
                if (creature.isActive()) {
                    wall.checkJump(creature);
                    wall.checkRun(creature);
                } else {
                    System.out.printf("%s %s не выдержал тяжести гонки \n", creature.getType(), creature.getName());
                }
            }
        }
        
        System.out.println("Прошедшие дистанцию!!");
        for (Personal creature : creatures) {
            if (creature.isActive()) {
                System.out.printf("%s %s: еще мог пробежать - %d м, пропрыгать - %d м", creature.getType(), creature.getName(), creature.getRunDistance(), creature.getJumpDistance());
                System.out.println();
            }
        }


    }

}
