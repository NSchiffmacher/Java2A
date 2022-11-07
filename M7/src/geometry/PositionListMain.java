package geometry;

import java.util.ArrayList;
import java.util.Collections;

public class PositionListMain {
    public static void main(String[] args) {
        ArrayList<Position> pos = new ArrayList<>();
        pos.add(new Position(2, 1));
        pos.add(new Position(1, 2));
        pos.add(new Position(1, 1));
        pos.add(new Position(1, 3));

        System.out.println(pos);
        Collections.sort(pos);
        System.out.println(pos);
        
    }   
}
