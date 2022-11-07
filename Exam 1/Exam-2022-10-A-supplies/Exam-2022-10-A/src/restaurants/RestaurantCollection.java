package restaurants;

import java.util.HashMap;

public class RestaurantCollection {
    private HashMap<String, Restaurant> restaurants; // Will map every name to it's restaurant object
    // Get and put are O(1) for a HashMap, while get is O(log(n)) for TreeMaps, 
    // And we don't really care about the ordering here,
    // So it's better to use a HashMap
    
    public RestaurantCollection(){
        this.restaurants    = new HashMap<>();
    }

    public void add(Restaurant restaurant){
        // Simply add restaurants in the HashMap such as it can be accessed using it's name
        this.restaurants.put(restaurant.getName(), restaurant);
    }

    public Restaurant get(String name){
        return this.restaurants.get(name);
    }
}
