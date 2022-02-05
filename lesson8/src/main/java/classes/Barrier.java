package classes;

abstract public class Barrier {

    private int roadDistance = 0;
    private int jumpDistance = 0;

    public int getRoadDistance() {
        return roadDistance;
    }

    public void setRoadDistance(int roadDistance) {
        this.roadDistance = roadDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public void checkJump(Personal personal) {
        if (jumpDistance > 0) {
            if (jumpDistance > personal.getJumpDistance()) {
                System.out.printf("%s %s  не прыгнул выше %d: и сошел с дистанции \n", personal.getType(), personal.getName(), jumpDistance);
                personal.setActive(false);
            } else {
                System.out.printf("%s %s перепрыгивает через стену %d м \n", personal.getType(), personal.getName(), jumpDistance);
                personal.setJumpDecreaseDistance(jumpDistance);
            }
        }
    }

    public void checkRun(Personal personal) {
        if (roadDistance > 0) {
            if (roadDistance > personal.getRunDistance()) {
                System.out.printf("%s %s  не пробежал дистанцию %d и выбыл из гонки \n", personal.getType(), personal.getName(), roadDistance);
                personal.setActive(false);
            } else {
                System.out.printf("%s %s одолел дистанцию %d \n", personal.getType(), personal.getName(), roadDistance);

                personal.setRunDecreaseDistance(roadDistance);
            }
        }
    }
}
