package mobility.model;

public class Drunkard extends Mobile{
    public Drunkard(double x0, double y0, double speed){
        super(x0, y0, speed);
    }

    public void move(double timeStep){
        theta = rand.nextGaussian() * Math.PI / 12 + theta;
        x += Math.cos(theta) * speed * timeStep;
        y += Math.sin(theta) * speed * timeStep;
    }

    public String toString(){
        return "D " + super.toString();
    }
    
}
