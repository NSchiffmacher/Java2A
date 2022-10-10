public class RGB {
    private double red;
    private double green;
    private double blue;

    final static public double MIN_RANGE = 0;
    final static public double MAX_RANGE = 1;

    public RGB(double r, double g, double b) {
        this.set(r, g, b);
    }

    public RGB(double grey){
        this(grey, grey, grey);
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

    public boolean equals(RGB color) {
        if (color == null) return false;
        return this.red == color.red && this.blue == color.blue && this.green == color.green;
    }

    public boolean hasValuesInRange(){
        return (
            MIN_RANGE <= this.red && this.red <= MAX_RANGE &&
            MIN_RANGE <= this.green && this.green <= MAX_RANGE &&
            MIN_RANGE <= this.blue && this.blue <= MAX_RANGE 
        );
    }
    public boolean isValueInRange(double value) {
        return MIN_RANGE <= value && value <= MAX_RANGE;
    }


}
