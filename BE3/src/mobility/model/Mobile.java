package mobility.model;

import java.util.Random;

abstract public class Mobile {
    protected static Random rand = new Random();

    protected double x;
    protected double y;
    protected double theta;
    protected double speed;

    public Mobile(double x, double y, double speed){
        this.x = x;
        this.y = y;
        this.speed = speed;

        if (speed < 0){
            throw new IllegalArgumentException("Speed can't be negative.");
        }
    }

    abstract public void move(double timeStep);

    public double getX() { return this.x; }
    public double getY() { return this.y; }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
