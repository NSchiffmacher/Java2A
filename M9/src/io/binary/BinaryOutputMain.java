package io.binary;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import geometry.Position;

public class BinaryOutputMain {
    public static void main(String[] args) throws Exception {
        FileOutputStream file = new FileOutputStream("data/data.bin");
        ObjectOutputStream output = new ObjectOutputStream(file);
        
        Position test = new Position(1, 2);
        output.writeObject(test);

        ArrayList<Position> arr = new ArrayList<>();
        arr.add(new Position(0, 1));
        arr.add(new Position(1, 1));
        arr.add(new Position(1, 0));
        output.writeObject(arr);


        output.close();
    }
}
