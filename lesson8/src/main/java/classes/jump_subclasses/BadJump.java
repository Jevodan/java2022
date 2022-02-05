package classes.jump_subclasses;

import interfaces.JumpBehavior;

public class BadJump implements JumpBehavior {

    @Override
    public int jump() {
        int minJump = 1;
        int maxJump = 6;
        return minJump + (int) (Math.random() * maxJump);
    }
}
