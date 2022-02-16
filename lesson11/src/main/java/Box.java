import java.util.ArrayList;

public class Box<T extends Fruit> {

    private T fruit;
    private ArrayList<T> box = new ArrayList<>();

    public Box(T fruit) {
        this.fruit = fruit;
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void setBox(ArrayList<T> box) {
        this.box = box;
    }

    public float getWeight() {
        return fruit.getWeight() * box.size();
    }

    public boolean compareTo(Box box2) {
        return (getWeight() == box2.getWeight());
    }

    public void unionBox(Box<T> box2) {
        box2.getBox().addAll(box);
        box.clear();
    }

    public void addFruit() {
        box.add(fruit);
    }

}
