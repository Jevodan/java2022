package sub;

import interfaces.SweemBehavior;

public class CanSweem implements SweemBehavior {

    private static final int SWEEM_LIMIT = 10;

    @Override
    public void sweem(int distance, String name) {
        if (distance > SWEEM_LIMIT) System.out.println(name + " не проплыл " + distance + " метров");
        else System.out.println(name + " проплыл " + distance + " метров");
    }
}
