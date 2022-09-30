public class RGB {
    private double red;
    private double green;
    private double blue;

    public RGB(double r, double g, double b) {
        this.set(r, g, b);
    }

    public RGB(){
        this(0,0,0);
    }

    public void set(double r, double g, double b){
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public void set(double grey){
        this.set(grey, grey, grey);
    }

    public void display(){
        System.out.println("RGB(" + this.red + ", " + this.green + ", " + this.blue + ")");
    }

    public double greyLevel(){
        return (this.red + this.green + this.blue) / 3;
    }

    public void turnToGrey(){
        double grey = this.greyLevel();
        this.set(grey);
    }
}
