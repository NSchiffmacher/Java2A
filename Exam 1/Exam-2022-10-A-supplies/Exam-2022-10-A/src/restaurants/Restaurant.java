package restaurants;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cuisine;
    private ArrayList<Rating> ratings;

    public Restaurant(String name, String cuisine){
        this.name       = name;
        this.cuisine    = cuisine;
        this.ratings    = new ArrayList<>();
    }

    public void addRating(Rating rating){
        this.ratings.add(rating);
    }

    public String getName(){
        return this.name;
    }

    public double averageQuality(){
        // Check if ratings is empty
        if (this.ratings.isEmpty()) return Double.NaN;

        // Compute the average otherwise
        double total = 0;
        for (Rating rating: this.ratings){
            total += rating.getQuality();
        }
        return total / this.ratings.size();
    }

    public String toString(){
        double average      = this.averageQuality();
        int numRatings      = this.ratings.size();
        return "\"" + this.name + "\"" + ", " + this.cuisine + ", " + (
            Double.isNaN(average) // or numRatings == 0
            ? "aucune évaluation"
            : numRatings + " évaluations, qualité moyenne " + average + "/4"
        );

    }
}
