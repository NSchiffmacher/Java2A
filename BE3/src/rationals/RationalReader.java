package rationals;

import java.util.List;
import java.util.ArrayList;

import java.io.FileReader;
import java.io.BufferedReader;

public class RationalReader {
    static public List<Rational> read(String filename){
        List<Rational> list = new ArrayList<>();

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
                String[] tokens = line.split(" ");
                for (String token: tokens){
                    list.add(Rational.parseRational(token)); 
                }
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
