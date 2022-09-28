package geometry;

public class PolyMain {
    public static void main(String[] args) {
        Polyline line = new Polyline();
        System.out.println(line.toString());
        line.addEdge(new Position(0, 0));
        line.addEdge(new Position(4, 0));
        line.addEdge(new Position(4, 3));
        line.addEdge(new Position(0, 3));
        System.out.println(line.toString());
        line.clearEdges();
        System.out.println(line.toString());
    }
}
