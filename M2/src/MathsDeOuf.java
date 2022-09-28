public class MathsDeOuf {
    public static void main(String[] args) {
        double a = 1;
        double b = 4;

        System.out.println("Hypo(1, 4) = " + MathsDeOuf.hypotenuse(a, b));
    
        double brestLat = 48.390394;
        double brestLon = -4.486076;
        double touloLat = 43.604652;
        double touloLon = 1.444209;

        System.out.println("Distance Toulouse-Brest = " + distance(brestLat, brestLon, touloLat, touloLon));  
    }

    public static double hypotenuse(double a, double b){
        return Math.sqrt(a * a + b * b);
    }
    public static double circumference(double r){
        return 2 * Math.PI * r;
    }
    public static double surface(double r){
        return Math.PI * r * r;
    }
    public static double distance(double aLat, double aLon, double bLat, double bLon){
        double r = 6370;
        double a = Math.toRadians(aLat);
        double b = Math.toRadians(bLat);
        double c = Math.toRadians(aLon);
        double d = Math.toRadians(bLon);

        double deltaLatHalf = (b-a)/2;
        double deltaLonHalf = (d-c)/2;
        return 2 * r * Math.asin(Math.sqrt( Math.sin(deltaLatHalf) * Math.sin(deltaLatHalf)  + Math.cos(a) * Math.cos(b) * Math.sin(deltaLonHalf) * Math.sin(deltaLonHalf)));
    }

}
