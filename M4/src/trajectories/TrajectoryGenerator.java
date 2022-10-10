package trajectories;

import geometry.Polyline;
import geometry.Position;

import java.lang.Math;

public class TrajectoryGenerator {
    public static Polyline generateRandom(int numPoints, double minX, double maxX, double minY, double maxY){
        Polyline res = new Polyline();

        for (int i = 0; i < numPoints; i++){
            double x = Math.random() * (maxX-minX) + minX;
            double y = Math.random() * (maxY-minY) + minY;

            res.addEdge(new Position(x, y));
        }
        return res;
    }
    public static Polyline generateBrownian(int numPoints, double step){
        Polyline res = new Polyline();

        res.addEdge(new Position(Math.random(), Math.random()));

        for (int i = 1; i < numPoints; i++){
            double teta = Math.random() * 2 * Math.PI;
            double r = Math.random() * step;

            double lastX = res.getLast().getX();
            double lastY = res.getLast().getY();

            double x = lastX + r * Math.cos(teta);
            double y = lastY + r * Math.sin(teta);

            res.addEdge(new Position(x, y));
        }
        return res;
    }

    public Polyline generate(int numPoints){
        if (Math.random() < .5){
            return generateRandom(numPoints, 0, 1, 0, 1);
        }
        return generateBrownian(numPoints, 1);
    }

}
