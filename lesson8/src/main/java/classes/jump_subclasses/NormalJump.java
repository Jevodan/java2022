package classes.jump_subclasses;

import interfaces.JumpBehavior;

public class NormalJump implements JumpBehavior {

    @Override
    public int jump() {
        int minJump = 5;
        int maxJump = 14;
        return minJump + (int) (Math.random() * maxJump);
    }
}
