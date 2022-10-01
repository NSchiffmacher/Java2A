package trips;

public class Flight {
    private String  flightNumber;
    private Airport departureAirport;
    private Airport arrivalAirport;

    public Flight(String num, Airport depAirport, Airport arrAirport){
        this.flightNumber       = num;
        this.departureAirport   = depAirport;
        this.arrivalAirport     = arrAirport; 
    }

    public String getFlightNumber() { return this.flightNumber; }
    public Airport getDepartureAirport() { return this.departureAirport; }
    public Airport getArrivalAirport() { return this.arrivalAirport; }
    
    public String toString(){
        return this.flightNumber + " : " + this.departureAirport.getIata() + " - " + this.arrivalAirport.getIata();
    }

}
