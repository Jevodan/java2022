package sub;


import interfaces.SweemBehavior;

public class NoSweem implements SweemBehavior {

    @Override
    public void sweem(int distance, String name) {
        System.out.println(name + " не умеет плавать");
    }
}
