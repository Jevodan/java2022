package classes.jump_subclasses;

import interfaces.RunBehavior;

public class UltraRun implements RunBehavior {

    @Override
    public int run() {
        int minRun = 1;
        int maxRun = 30;
        return minRun + (int) (Math.random() * maxRun);
    }
}
