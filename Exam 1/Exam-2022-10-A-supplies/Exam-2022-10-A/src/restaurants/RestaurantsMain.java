package restaurants;

public class RestaurantsMain {
   public static void main(String[] args) {
      // Rating
      Rating rating = new Rating(2, "Pas très bon mais on est vite servi");
      System.out.println(rating);
      System.out.println(new Rating(333, "Génial"));

      // Restaurant
      Restaurant macdo = new Restaurant("MacDo", "Fast food");
      System.out.println(macdo); // should print MacDo and no rating
      macdo.addRating(new Rating(4, "Fabuleux"));
      macdo.addRating(new Rating(4, "Awesome"));
      macdo.addRating(new Rating(1, "Pas terrible"));
      System.out.println(macdo); // should print MacDo and 3 ratings

      // RestaurantCollection
      RestaurantCollection collection = new RestaurantCollection();
      Restaurant s = collection.get("MacDo");
      System.out.println(s); // should print null
      collection.add(macdo);
      s = collection.get("MacDo");
      System.out.println(s); // should print MacDo as before
   }
}
