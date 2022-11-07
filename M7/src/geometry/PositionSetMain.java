package geometry;

import java.util.TreeSet;

public class PositionSetMain {
    public static void main(String[] args) {
        TreeSet<Position> set = new TreeSet<>();
        set.add(new Position(2, 1));
        set.add(new Position(1, 2));
        set.add(new Position(1, 1));
        set.add(new Position(1, 3));

        System.out.println(set);
    }
}
