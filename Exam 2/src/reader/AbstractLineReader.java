package reader;

import java.util.List;
import java.util.ArrayList;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public abstract class AbstractLineReader<T> {
    private String dataLabel;

    protected AbstractLineReader(String dataLabel) {
        this.dataLabel = dataLabel;
    }

    public List<T> read(String filename) throws IOException{
        // Comments = Code without "throws IOException"

        List<T> list = new ArrayList<>();

        // Opening file
        FileReader in;
        BufferedReader bin;

        // try {
        in = new FileReader(filename);
        bin = new BufferedReader(in);
        // } catch (Exception e) {
        //     System.out.println("[ERROR] Opening file \"" + filename + "\"");
        //     return list;
        // }

        // Reading from file

        // try {

        int lineNumber = 1;
        while(bin.ready()) {
            String line = bin.readLine();
            T element;

            try {
                element = this.getElementFromLine(line);
                list.add(element);
            } catch (Exception e) {
                System.err.println(filename + ":" + lineNumber + ": cannot get " + this.dataLabel + " from line '" + line + "'");
                // It's not specified what to do in case of a failure : whether we should keep going or stop there
            }
            
            lineNumber++;
        }

        // } catch (Exception e){
        //     System.out.println("[ERROR] Parsing file \"" + filename + "\"");
        //     e.printStackTrace();
        // }

        // Closing file
        // try { 
        bin.close();
        // } catch (Exception e){
        //     System.out.println("[ERROR] Closing (???) file \"" + filename + "\"");
        // }
        return list;
    }

    protected abstract T getElementFromLine(String line);

}
