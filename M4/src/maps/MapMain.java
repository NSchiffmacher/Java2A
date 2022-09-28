package maps;

import java.util.HashMap;
import geometry.Position;

public class MapMain {
    public static void main(String[] args) {
        HashMap<String, Position> hashmap = new HashMap<>();

        hashmap.put("origin", new Position(0,0));
        hashmap.put("ones", new Position(1,1));

        System.out.println(hashmap);
    }
}
