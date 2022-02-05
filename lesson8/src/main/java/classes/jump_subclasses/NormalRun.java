package classes.jump_subclasses;

import interfaces.RunBehavior;

public class NormalRun implements RunBehavior {

    @Override
    public int run() {
        int minRun = 5;
        int maxRun = 15;
        return minRun + (int) (Math.random() * maxRun);
    }
}
