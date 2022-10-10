package geometry;

public class DistanceMain {
    public static void main(String[] args) {
        Position p1 = new Position(2, 3);
        Position p2 = new Position(-1, -1);

        System.out.println("Euclidean: " + Position.distance(DistanceType.EUCLIDEAN, p1, p2));
        System.out.println("Manhattan: " + Position.distance(DistanceType.MANHATTAN, p1, p2));
    }
}
