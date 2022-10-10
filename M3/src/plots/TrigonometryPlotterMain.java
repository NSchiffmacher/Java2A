package plots;

import javax.swing.JFrame;
import ptolemy.plot.Plot;

import java.util.function.Function;
import java.lang.Math;

public class TrigonometryPlotterMain {
    public static void drawFunction(Plot plot, int curve, Function<Double, Double> func, double start, double end, double step){
        for (double x = start; x < end; x += step ){
            double eval = func.apply(x);
            plot.addPoint(curve, x, eval, true);
        }
    }

    public static void drawCos(Plot plot, int curve){
        Function<Double, Double> inter = x -> Math.cos(Math.toRadians(x));
        drawFunction(plot, curve, inter, 0, 360, 1); 
    }

    public static void drawSin(Plot plot, int curve){
        Function<Double, Double> inter = x -> Math.sin(Math.toRadians(x));
        drawFunction(plot, curve, inter, 0, 360, 1); 
    }

    public static void main(String[] args) {
        Plot plot = new Plot();

        // draw in the plot
        drawCos(plot, 0);
        drawSin(plot, 1);

        // show the plot
        JFrame frame = new JFrame("Askip c'est un graphe");
        frame.add(plot);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
