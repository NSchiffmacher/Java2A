package geometry;

import java.util.Scanner;
import java.util.Locale;

public class DistanceScannerMain {
    public static Position readPosition(Scanner scanner, String name){
        System.out.println("Enter the coordinates for p1 : ");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        System.out.println("");
        return new Position(x, y);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Position p1 = readPosition(scanner, "p1");
        Position p2 = readPosition(scanner, "p2");

        System.out.println("p1 : " + p1);
        System.out.println("p2 : " + p2);

        System.out.println("\nDistances between p1 and p2:");
        System.out.println("    Euclidean = " + Position.distance(DistanceType.EUCLIDEAN, p1, p2));
        System.out.println("    Manhattan = " + Position.distance(DistanceType.MANHATTAN, p1, p2));

    }
}
