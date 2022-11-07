package geometry;

public class OrderedPositionsMain {
    public static void main(String[] args) {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(2, 2);
        Position p3 = new Position(0, 2);

        Position p4 = new Position(1, 1);
        Position p5 = new Position(1, 2);
        Position p6 = new Position(1, 3);

        System.out.println("p1 < p2 (-1): " + p1.compareTo(p2));
        System.out.println("p1 < p3 (1): " + p1.compareTo(p3));

        System.out.println("p1 < p4 (1): " + p1.compareTo(p4));
        System.out.println("p1 < p5 (0): " + p1.compareTo(p5));
        System.out.println("p1 < p6 (-1): " + p1.compareTo(p6));
    }
}
