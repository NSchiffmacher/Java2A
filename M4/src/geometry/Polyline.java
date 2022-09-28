package geometry;

import java.util.ArrayList;

public class Polyline {
    private ArrayList<Position> edges;

    public Polyline(){
        edges = new ArrayList<>();
    }

    public void addEdge(Position point){
        edges.add(point);
    }

    public void clearEdges(){
        edges.clear();
    }

    public int size(){
        return edges.size();
    }

    public double length(){
        double res = 0;
        Position a, b;
        for (int i = 0; i < this.size() - 1; i++){
            a = edges.get(i);
            b = edges.get(i+1);

            res += Position.distance(a, b);
        }
        return res;
    }

    public Position getLast(){
        return edges.get(this.size() - 1);
    }

    public Position get(int index){
        return edges.get(index);
    }

    public String toString(){
        return "edges=" + edges 
            + " size=" + this.size()
            + " length=" + this.length();
    }
}
