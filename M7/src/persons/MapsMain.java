package persons;

import java.util.HashMap;
import java.util.Map;

public class MapsMain { 
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("Nathan", 21), "Nathan");  
        
        System.out.println(map);
        System.out.println(map.containsKey(new Person("Nathan", 21)));
    }
}
