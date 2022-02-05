package classes.jump_subclasses;

import interfaces.JumpBehavior;

public class UltraJump implements JumpBehavior {

    @Override
    public int jump() {
        int minJump = 1;
        int maxJump = 25;
        return minJump + (int) (Math.random() * maxJump);
    }
}
