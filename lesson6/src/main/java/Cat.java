import interfaces.RunBehavior;
import interfaces.SweemBehavior;
import sub.NoSweem;
import sub.RunAsCat;

public class Cat extends Animal {
    public static int counter;

    public Cat(String name) {
        super(name);
        runBehavior = new RunAsCat();
        sweemBehavior = new NoSweem();
    }
}
