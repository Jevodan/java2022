package classes;

import classes.jump_subclasses.NormalJump;
import classes.jump_subclasses.NormalRun;

public class Cat extends Personal {

    public Cat(String name) {
        runBehavior = new NormalRun();
        jumpBehavior = new NormalJump();
        this.perfomeRun();
        this.perfomeJump();
        setName(name);
        setType("Кот");
    }

}
