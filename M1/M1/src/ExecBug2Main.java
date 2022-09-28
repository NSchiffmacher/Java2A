public class ExecBug2Main {
    public static void main(String[] args) {
        Position p = new Position(1,1);
        p.display();
        p.moveTo(4,2);
        p.display();
    }
}
