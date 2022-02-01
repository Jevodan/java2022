public class Cat {

    final private String name;
    final private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            this.satiety = true;
        }
    }

    public void info() {
        System.out.print("Кот " + this.name);
        if (satiety) System.out.println(" сыт");
        else System.out.println(" голоден");
    }
}
