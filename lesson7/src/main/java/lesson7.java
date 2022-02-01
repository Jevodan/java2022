public class lesson7 {

    public static void main(String[] args) {

        Cat[] cats = new Cat[]{
                new Cat("Барсик", 5),
                new Cat("Васька", 35),
                new Cat("Огнейка", 15),
                new Cat("Дракарис", 215),
                new Cat("Дымок", 25)
        };

        Plate plate = new Plate(270);

        for (Cat cat : cats) {
            cat.info();
            cat.eat(plate);
            cat.info();
        }

        // Добавим еды голодному коту
        plate.increaseFood(50);
        cats[4].eat(plate);
        cats[4].info();

    }

}
