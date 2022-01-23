public class lesson6 {

    public static void main(String[] args) {

        String[] namesDog = {"Лёка", "Лаки", "Мухтар", "Персик", "Симба"};
        String[] namesCat = {"Васька", "Мурзик", "Симон", "Филимон", "Барсик"};
        System.out.println("Дистанция для собак:");
        for (int i = 0; i < 5; i++) {
            Dog dog = new Dog(namesDog[i]);
            dog.perfomeRun((int) (Math.random() * 1000));
            dog.perfomeSweem((int) (Math.random() * 20));
        }
        System.out.println("Дистанция для котов:");
        for (int i = 0; i < 5; i++) {
            Cat cat = new Cat(namesCat[i]);
            cat.perfomeRun((int) (Math.random() * 1000));
            if (i % 2 == 0) cat.perfomeSweem((int) (Math.random() * 1));
        }
    }
}
