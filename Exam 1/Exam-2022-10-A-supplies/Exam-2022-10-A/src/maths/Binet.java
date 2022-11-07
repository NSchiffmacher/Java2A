package maths;

import java.lang.Math;

public class Binet {
    public static double fibonacci(int n){
        // As the result of this function of Math.round is an integer, and so is Fn, 
        // I think the return type of this function should be int
        // Still, I followed the UML diagram

        double phi = (1. + Math.sqrt(5)) / 2.;
        return Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}
