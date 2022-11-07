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
<<<<<<< HEAD
        return this.getIata().equals(other.getIata());
=======
        return this.iata == other.iata;
>>>>>>> 839771ce6a6e4354623daca8bf1f175e31516b1e
        
    }

    public String toString(){
        return this.name + " (" + this.iata + ")";
    }
}
