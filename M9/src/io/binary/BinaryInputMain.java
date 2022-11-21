package io.binary;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import geometry.Position;
import java.util.ArrayList;

public class BinaryInputMain {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("data/data.bin");
        ObjectInputStream input = new ObjectInputStream(file);
  
        Position p = (Position)input.readObject();
        ArrayList<?> arr = (ArrayList<?>)input.readObject();

        System.out.println(p);
        System.out.println(arr);

        // int i = ois.readInt();
        // String today = (String) ois.readObject();
        // Date date = (Date) ois.readObject();
  
        input.close();
    }
}
