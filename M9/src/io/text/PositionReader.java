package io.text;

import java.util.List;

import java.util.ArrayList;
import geometry.Position;
import java.io.FileReader;
import java.io.BufferedReader;

public class PositionReader {
    // Attention : le type de retour de read(String) est List<Position>, pas
//ArrayList<Position> ; List<E> est une interface prédéfinie de java.util, réalisée
//par ArrayList

    public static List<Position> read(String filename){
        List<Position> list = new ArrayList<>();


        // Opening file
        FileReader in;
        BufferedReader bin;
        try {
            in = new FileReader(filename);
            bin = new BufferedReader(in);
        } catch (Exception e) {
            System.out.println("[ERROR] Opening file \"" + filename + "\"");
            return list;
        }

        // Reading from file

        try {
            while(bin.ready()) {
                String line = bin.readLine();
                String[] tokens = line.split(",");

                double x = Double.parseDouble(tokens[0].trim());
                double y = Double.parseDouble(tokens[1].trim());
                list.add(new Position(x, y));
            }
        } catch (Exception e){
            System.out.println("[ERROR] Parsing file \"" + filename + "\"");
            e.printStackTrace();
        }

        // Closing file
        try { 
            bin.close();
        } catch (Exception e){
            System.out.println("[ERROR] Closing (???) file \"" + filename + "\"");
        }
        return list;
    }
}
