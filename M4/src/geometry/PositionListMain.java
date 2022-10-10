package geometry;

import java.util.ArrayList;

public class PositionListMain {
    public static void main(String[] args) {
        ArrayList<Position> listOfPos = new ArrayList<>();
        listOfPos.add(new Position(0,1));
        listOfPos.add(new Position(1,1));
        listOfPos.add(new Position(1,8));

        for (Position pos: listOfPos){
            System.out.println(pos);
        }
        System.out.println(listOfPos);
    }
}
