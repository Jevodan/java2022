package classes;

import classes.jump_subclasses.UltraJump;
import classes.jump_subclasses.UltraRun;

public class Robot extends Personal {

    public Robot(String name) {
        runBehavior = new UltraRun();
        jumpBehavior = new UltraJump();
        this.perfomeRun();
        this.perfomeJump();
        setName(name);
        setType("Робот");
    }

}
