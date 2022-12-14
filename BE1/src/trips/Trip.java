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

        int i = 0;
        while (i < numFlights-1 && valid) {
            valid &= flights.get(i).isConnectedTo(flights.get(i+1));
            i++;
        }

<<<<<<< HEAD
        return valid && (numFlights > 0);
=======
        return valid;
>>>>>>> 839771ce6a6e4354623daca8bf1f175e31516b1e
    }

    public String toString(){
        int numFlights = this.flights.size();
        if (numFlights == 0) return "No flight yet";

        Airport dep = this.flights.get(0).getDepartureAirport();
        Airport arr = this.flights.get(numFlights-1).getArrivalAirport();

        return dep.getIata() + " - " + arr.getIata() + " (" + (numFlights > 1 ? (numFlights + " flights") : "direct") + ")";
    }
}
