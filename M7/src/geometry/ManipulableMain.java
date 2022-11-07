package geometry;

import java.util.ArrayList;

public class ManipulableMain {
    public static void main(String[] args) {
        ArrayList<Manipulable> arr = new ArrayList<>();
        arr.add(new Position(0, 1));
        arr.add(new Circle(1, 0, 0));
        arr.add(new Position(2, 1));
        arr.add(new Circle(7, -3.5, 1));

        for (Manipulable m: arr){
            m.translate(100, 100);
            // ((Displayable)m).display();
        }
    }
}
