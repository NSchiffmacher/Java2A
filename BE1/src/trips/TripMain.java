package trips;

public class TripMain {
    public static void main(String[] args) {
        Airport TLS = new Airport("Toulouse Blagnac", "TLS");
        Airport CDG = new Airport("Charles de Gaulle", "CDG");

        Flight flight = new Flight("AF1234", TLS, CDG);

        System.out.println(TLS + ", " + CDG);
        System.out.println(flight);
    }
}
