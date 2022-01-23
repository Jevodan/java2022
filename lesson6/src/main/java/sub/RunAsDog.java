package sub;

import interfaces.RunBehavior;

public class RunAsDog implements RunBehavior {

    private static final int RUN_LIMIT = 500;

    @Override
    public void run(int distance, String name) {
        if (distance > RUN_LIMIT) System.out.println(name + " не пробежал " + distance + " метров");
        else System.out.println(name + " пробежал " + distance + " метров");
    }
}
