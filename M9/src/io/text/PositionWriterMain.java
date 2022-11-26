package io.text;

import java.util.List;
import java.util.ArrayList;

import geometry.Position;

public class PositionWriterMain {
    public static void main(String[] args) throws Exception {
        List<Position> array = new ArrayList<>();
        array.add(new Position(1, 0));
        array.add(new Position(2, 0));
        array.add(new Position(8, 7));
        array.add(new Position(1.5, 0));

        PositionWriter.write(array, "test.txt", false);

        List<Position> arr = PositionReader.read("test.txt");
        System.out.println(arr);

        System.out.println(Position.barycenter(arr));
    }
}
