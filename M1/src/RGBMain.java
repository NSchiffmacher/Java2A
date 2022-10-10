import java.util.Scanner;

public class RGBMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        double r, g, b;
        System.out.println("* Enter your RGB values :");
        System.out.print("  - Red : ");   r = sc.nextDouble();
        System.out.print("  - Green : "); g = sc.nextDouble();
        System.out.print("  - Blue : ");  b = sc.nextDouble();
        

        RGB purple = new RGB(r, g, b);
        purple.display();
        
        purple.turnToGrey();
        purple.display();
    }
}
