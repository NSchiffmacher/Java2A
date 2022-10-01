package trips;

public class Airport {
    private String name;
    private String iata;
    
    public Airport(String name, String iata){
        this.name = name;
        this.iata = iata;
    }

    public String getName() { return name; }
    public String getIata() { return iata; }

    public boolean isSameAs(Airport other){
        return this.iata == other.iata;
    }

    public String toString(){
        return this.name + " (" + this.iata + ")";
    }
}
