package classes;

import interfaces.JumpBehavior;
import interfaces.RunBehavior;

abstract public class Personal {

    public JumpBehavior jumpBehavior;
    public RunBehavior runBehavior;
    private String name;
    private String type;
    private int runDistance;
    private int jumpDistance;
    private boolean active = true;

    public void perfomeRun() {
        runDistance = runBehavior.run();
    }

    public void perfomeJump() {
        jumpDistance = jumpBehavior.jump();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public void setJumpDecreaseDistance(int jumpDistance) {
        this.jumpDistance -= jumpDistance;
    }

    public void setRunDecreaseDistance(int runDistance) {
        this.runDistance -= runDistance;
    }



    public void info() {
        System.out.printf("%s %s: бег - %d м, прыжок - %d м", getType(), getName(), getRunDistance(), getJumpDistance());
        System.out.println();
    }

  }
