package algos;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;

public class CollectionsAlgorithmsMain {
    public static void main(String[] args) {
        int N = 5;
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < N; i++){
            values.add(Math.random());
        }
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
        System.out.println("min=" + Collections.min(values) + " max=" + Collections.max(values));
    }    
}
