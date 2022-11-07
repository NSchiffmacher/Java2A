package airlines;

<<<<<<< HEAD
import java.util.TreeMap;
=======
import java.util.HashMap;
>>>>>>> 839771ce6a6e4354623daca8bf1f175e31516b1e

public class TravelAgency {

   private String name;
<<<<<<< HEAD
   private TreeMap<String, Airline> suppliers; 

   public TravelAgency(String name) {
      this.name = name;
      this.suppliers = new TreeMap<>();
=======
   private HashMap<String, Airline> suppliers; 

   public TravelAgency(String name) {
      this.name = name;
      this.suppliers = new HashMap<>();
>>>>>>> 839771ce6a6e4354623daca8bf1f175e31516b1e
   }

   public void addAirline(Airline airline) {
      this.suppliers.put(airline.getIata(), airline);
   }

   public Airline getAirlineByIata(String iata) {
      return this.suppliers.get(iata);
   }

   public void display() {
      System.out.println(this.name);
      System.out.println("Suppliers:");
      System.out.println(this.suppliers);
   }
}
