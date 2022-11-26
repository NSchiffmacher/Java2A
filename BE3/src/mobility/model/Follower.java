package mobility.model;

public class Follower extends Mobile {
    private int M;
    private int n;
    private Mobile leader;

    public Follower(double x0, double y0, Mobile leader, int M){
        super(x0, y0, leader.speed);
        
        this.leader = leader;
        this.M = M;
        this.n = 0;
    }

    public void move(double timeStep){
        if (this.n % this.M == 0){
            double dir_to_leader = Math.atan2(this.leader.y - this.y, this.leader.x - this.x);
            this.theta = rand.nextGaussian() * Math.PI / 12 + dir_to_leader;
        }

        this.x += Math.cos(this.theta) * this.speed * timeStep;
        this.y += Math.sin(this.theta) * this.speed * timeStep;
        this.n += 1;
    }

    public String toString(){
        return "F " + super.toString() + " -> " + this.leader.toString();
    }
}
