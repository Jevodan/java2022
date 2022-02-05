import classes.*;
import org.apache.commons.lang3.ArrayUtils;

public class SimpleFactory {

    public static String[] names = {
            "T 1000",
            "Jack",
            "Mikkie",
            "Simon",
            "Patrick",
            "Fedor",
            "Verter",
            "Andre",
            "Filimon",
            "Alex",
            "T 600",
            "Vasiliy"};

    public Personal createPers(String type) {
        Personal personal = null;
        int randomIndex = (int) (Math.random() * names.length);

        if (type.equals("Cat")) {
            personal = new Cat(names[randomIndex]);
        } else if (type.equals("Human")) {
            personal = new Human(names[randomIndex]);
        } else if (type.equals("Robot")) {
            personal = new Robot(names[randomIndex]);
        }
        names =  ArrayUtils.remove(names, randomIndex);
        return personal;
    }

    public Barrier createBarrier(String type){
        Barrier barrier = null;
        int minBarrier = 1;
        int run = minBarrier + (int) (Math.random() * 5);
        int jump = minBarrier + (int) (Math.random() * 2);

        if (type.equals("Road")) {
            barrier = new RunRoad(run);
        } else if (type.equals("Wall")) {
            barrier = new JumpWall(jump);
        }
        return barrier;
    }
}
