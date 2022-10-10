package trajectories;

import geometry.Polyline;

import javax.swing.JFrame;
import ptolemy.plot.Plot;

public class TrajectoryGeneratorMain {
    public static void main(String[] args) {
        Polyline random = TrajectoryGenerator.generateRandom(50, -10, 10, -10, 10);
        Polyline brownian = TrajectoryGenerator.generateBrownian(100, 2.5);
    
        Plot plot = new Plot();
        for (int i = 0; i < random.size(); i++){
            plot.addPoint(1, random.get(i).getX(), random.get(i).getY(), true);
        }
        for (int i = 0; i < brownian.size(); i++){
            plot.addPoint(0 , brownian.get(i).getX(), brownian.get(i).getY(), true);
        }

        JFrame frame = new JFrame("Tema les traj");
        frame.add(plot);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
