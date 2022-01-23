import sub.CanSweem;
import sub.RunAsDog;

public class Dog extends Animal {
    public static int counter;

    public Dog(String name) {
        super(name);
        runBehavior = new RunAsDog();
        sweemBehavior = new CanSweem();
    }

}
