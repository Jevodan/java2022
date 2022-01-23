import interfaces.RunBehavior;
import interfaces.SweemBehavior;

public class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    RunBehavior runBehavior;
    SweemBehavior sweemBehavior;

    public void perfomeRun(int distance) {
        runBehavior.run(distance, name);
    }

    public void perfomeSweem(int distance) {
        sweemBehavior.sweem(distance, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
