package trips;

public class ValidationMain {
    public static void main(String[] args) {
        Airport TLS = new Airport("Toulouse Blagnac", "TLS");
        Airport CDG = new Airport("Charles de Gaulle", "CDG");
        Airport RKV = new Airport("Reykjavik", "RKV");

        Flight flight1 = new Flight("AF1234", TLS, CDG);
        Flight flight2 = new Flight("AF1235", CDG, RKV);
        Flight flight3 = new Flight("AF1236", RKV, CDG);

        Trip trip = new Trip();
        trip.addFlight(flight1);
        trip.addFlight(flight2);

        Trip trip2 = new Trip();
        trip2.addFlight(flight1);
        trip2.addFlight(flight3);

        System.out.println("true : " + TLS.isSameAs(TLS));
        System.out.println("false: " + TLS.isSameAs(CDG) + "\n");

        System.out.println("true : " + flight1.isConnectedTo(flight2));
        System.out.println("false: " + flight1.isConnectedTo(flight3) + "\n");

        System.out.println("true : " + trip.isValid());
        System.out.println("false: " + trip2.isValid());
    }
}
