public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("* Position\n");

        Position position1 = new Position(0,0);
        Position position2 = new Position(1,0);
        Position position3 = new Position(0,2);

        position1.display();
        System.out.println("Distance : " + position1.distanceToOrigin());

        position1.moveTo(1,2);
        position1.display();
        System.out.println("Distance : " + position1.distanceToOrigin());

        position1.moveTo(2,1);
        position1.display();
        System.out.println("Distance : " + position1.distanceToOrigin());

        position3.display();
        position2.display();
    }
}
