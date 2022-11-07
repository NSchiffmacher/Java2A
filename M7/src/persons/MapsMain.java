package persons;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapsMain { 
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("Nathan", 21), "Nathan");  
        
        System.out.println(map);
        System.out.println(map.containsKey(new Person("Nathan", 21)));


        Map<Person, String> nmap = new TreeMap<>();
        nmap.put(new Person("Nathan", 21), "Nathan");  
        nmap.put(new Person("Nathan", 23), "NathanVieux");  
        nmap.put(new Person("Pasmoa", 23), "PasMoi");  
        nmap.put(new Person("Alabama", 3), "Alabama");  
        
        System.out.println(nmap);
    }
}
