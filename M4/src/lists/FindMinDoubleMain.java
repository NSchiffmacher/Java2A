package lists;

import java.util.ArrayList;

public class FindMinDoubleMain {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Double> doubles = new ArrayList<>();

        // Fill it with stuff
        double[] val = {6, 3, 14, 2, 8, 6, 9};
        for (double e: val) doubles.add(e);

        // Compute the minimum value
        double min = Double.MAX_VALUE;
        for (double e: doubles){
            if (e < min) min = e;
        }

        // Print it
        System.out.println("Min: " + min);
        


    }
}
