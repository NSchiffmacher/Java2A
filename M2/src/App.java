public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        RGB inRange = new RGB(0.1);
        RGB notInRange = new RGB(1.1);
        RGB notInRange2 = new RGB(-1.1);

        System.out.println("In range    : " + inRange.hasValuesInRange());
        System.out.println("Not in range: " + !notInRange.hasValuesInRange());
        System.out.println("Not in range: " + !notInRange2.hasValuesInRange());
        
    }
}
