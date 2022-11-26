package io.text;

import geometry.Position;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;

public class PositionWriter {
    static public void write (Position position, String filename, boolean append){
        PrintWriter writer =  null;
        try {
            writer = new PrintWriter(new FileWriter(filename, append));
        } catch (Exception e){
            System.out.println("[ERROR] " + e);
            return;
        }

        writer.println(position.getX() + "," + position.getY());
        writer.close();
    }
    static public void write (Collection<Position> positions, String filename, boolean append){
        PrintWriter writer =  null;
        try {
            writer = new PrintWriter(new FileWriter(filename, append));
        } catch (Exception e){
            System.out.println("[ERROR] " + e);
            return;
        }

        for (Position position: positions){
            writer.println(position.getX() + "," + position.getY());
        }

        writer.close();
    }
}
