package restaurants;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class BasicRestaurantCollectionTest implements WithAssertions {

   @Test
   @Order(1)
   public void testRestaurantCollectionCreation() {
      RestaurantCollection collection = new RestaurantCollection();
      assertThat(collection).isNotNull();
      assertThat(collection).extracting("restaurants").isNotNull();
   }

   @Test
   @Order(2)
   public void testAddGetOneRestaurant() {
      RestaurantCollection collection = new RestaurantCollection();
      Restaurant restaurant = collection.get("R1");
      assertThat(restaurant).isNull();
      Restaurant s1 = new Restaurant("R1", "C1");
      collection.add(s1);
      restaurant = collection.get("R1");
      assertThat(restaurant).isNotNull();
      assertThat(restaurant).extracting("name", "cuisine").containsExactly("R1", "C1");
   }

   @Test
   @Order(3)
   public void testAddGetFourRestaurants() {
      RestaurantCollection collection = new RestaurantCollection();
      collection.add(new Restaurant("R1", "C1"));
      collection.add(new Restaurant("R2", "C2"));
      collection.add(new Restaurant("R3", "C3"));
      collection.add(new Restaurant("R4", "C4"));

      // random order for get
      assertThat(collection.get("R3"))
            .isNotNull()
            .extracting("name", "cuisine").containsExactly("R3", "C3");
      assertThat(collection.get("R4"))
            .isNotNull()
            .extracting("name", "cuisine").containsExactly("R4", "C4");
      assertThat(collection.get("R2"))
            .isNotNull()
            .extracting("name", "cuisine").containsExactly("R2", "C2");
      assertThat(collection.get("R1"))
            .isNotNull()
            .extracting("name", "cuisine").containsExactly("R1", "C1");
   }
}