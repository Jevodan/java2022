
// задание 3
public class lesson113 {

    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox = new Box<>(orange);
        Box<Apple> appleBox = new Box<>(apple);
        Box<Orange> orangeBox2 = new Box<>(orange);
        Box<Apple> appleBox2 = new Box<>(apple);

        orangeBox.addFruit();
        orangeBox.addFruit();
        orangeBox2.addFruit();
        orangeBox2.addFruit();
        orangeBox2.addFruit();
        System.out.println(orangeBox.compareTo(orangeBox2));
        orangeBox.unionBox(orangeBox2);

        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox2.getWeight());

    }

}
