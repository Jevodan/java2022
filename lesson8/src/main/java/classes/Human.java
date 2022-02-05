package classes;

import classes.jump_subclasses.BadJump;
import classes.jump_subclasses.NormalRun;

public class Human extends Personal {

    public Human(String name) {
        runBehavior = new NormalRun();
        jumpBehavior = new BadJump();
        this.perfomeRun();
        this.perfomeJump();
        setName(name);
        setType("Человек");
    }

}
