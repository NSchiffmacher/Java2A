package mobility.model;

public class Brownian extends Mobile {
    public Brownian(double x0, double y0, double speed){
        super(x0, y0, speed);
    }

    public void move(double timeStep){
        theta = rand.nextDouble() * 2 * Math.PI;
        x += Math.cos(theta) * speed * timeStep;
        y += Math.sin(theta) * speed * timeStep;
    }

    public String toString(){
        return "B " + super.toString();
    }
}
