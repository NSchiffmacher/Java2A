package trips;

public class TripMain {
    public static void main(String[] args) {
        Airport TLS = new Airport("Toulouse Blagnac", "TLS");
        Airport CDG = new Airport("Charles de Gaulle", "CDG");
        Airport RKV = new Airport("Reykjavik", "RKV");

        Flight flight1 = new Flight("AF1234", TLS, CDG);
        Flight flight2 = new Flight("AF1235", CDG, RKV);

        Trip trip = new Trip();
        trip.addFlight(flight1);
        trip.addFlight(flight2);

        System.out.println(TLS + ", " + CDG);
        System.out.println(trip);
    }
}
