public class Segment {
    private Position beg;
    private Position end;

    public Segment(Position beg, Position end){
        this.beg = beg;
        this.end = end;
    }

    public void moveTo(double xb, double yb, double xe, double ye){
        beg.moveTo(xb, yb);
        end.moveTo(xe, ye);
    }

    public double length(){
        return Position.distance(this.beg, this.end);
    }

    public void display(){
        System.out.print("beg = ");
        this.beg.display();
        
        System.out.print("end = ");
        this.end.display();
    }
}
