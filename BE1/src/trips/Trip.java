package trips;

import java.util.ArrayList;

public class Trip {
    private ArrayList<Flight> flights;

    public Trip(){
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public boolean isValid(){
        boolean valid = true;
        int numFlights = this.flights.size();

        for (int i = 0; i < numFlights - 1; i++){
            valid &= flights.get(i).isConnectedTo(flights.get(i+1));
        }

        return valid;
    }

    public String toString(){
        int numFlights = this.flights.size();
        if (numFlights == 0) return "No flight yet";

        Airport dep = this.flights.get(0).getDepartureAirport();
        Airport arr = this.flights.get(numFlights-1).getArrivalAirport();

        return dep.getIata() + " - " + arr.getIata() + " (" + (numFlights > 1 ? (numFlights + " flights") : "direct") + ")";
    }
}
