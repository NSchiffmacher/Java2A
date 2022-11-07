package restaurants;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(OrderAnnotation.class)
public class BasicRestaurantTest implements WithAssertions {

   @ParameterizedTest
   @CsvSource({
      "MacDo, Fast food",
      "La faim des haricots, Végétarien",
   })
   @Order(1)
   public void testRestaurantCreation(String name, String cuisine) {
      Restaurant Restaurant = new Restaurant(name, cuisine);
      assertThat(Restaurant).isNotNull();
      assertThat(Restaurant).extracting("name").isEqualTo(name);
      assertThat(Restaurant).extracting("cuisine").isEqualTo(cuisine);
      assertThat(Restaurant.getName()).isEqualTo(name);
      assertThat(Restaurant.toString()).contains(name, cuisine);
   }

   @Test
   @Order(2)
   public void testAddRating() {
      Restaurant Restaurant = new Restaurant("MacDo", "Fast food");
      assertThat(Restaurant).extracting("ratings").isNotNull();
      assertThat(Restaurant).extracting("ratings").asList().isEmpty();
      Restaurant.addRating(new Rating(1, "R1"));
      assertThat(Restaurant).extracting("ratings").asList().hasSize(1);
      Restaurant.addRating(new Rating(2, "R2"));
      assertThat(Restaurant).extracting("ratings").asList().hasSize(2);
      Restaurant.addRating(new Rating(3, "R3"));
      assertThat(Restaurant).extracting("ratings").asList().hasSize(3);
   }

   @Test
   @Order(3)
   public void testAverageQuality() {
      Restaurant Restaurant = new Restaurant("MacDo", "Fast food");
      assertThat(Restaurant.averageQuality()).isNaN();
      Restaurant.addRating(new Rating(3, "R1"));
      assertThat(Restaurant.averageQuality()).isEqualTo(3.0, within(1e-3));
      Restaurant.addRating(new Rating(3, "R2"));
      assertThat(Restaurant.averageQuality()).isEqualTo(3.0, within(1e-3));
      Restaurant.addRating(new Rating(2, "R3"));
      Restaurant.addRating(new Rating(1, "R4"));
      Restaurant.addRating(new Rating(1, "R5"));
      assertThat(Restaurant.averageQuality()).isEqualTo(2.0, within(1e-3));
   }

   @Test
   @Order(4)
   public void testToString() {
      Restaurant Restaurant = new Restaurant("MacDo", "Fast food");
      assertThat(Restaurant.toString()).contains("MacDo", "Fast food");
      Restaurant.addRating(new Rating(3, "R1"));
      assertThat(Restaurant.toString()).contains("MacDo", "Fast food", "1", "3");
      Restaurant.addRating(new Rating(3, "R2"));
      assertThat(Restaurant.toString()).contains("MacDo", "Fast food", "2", "3");
      Restaurant.addRating(new Rating(2, "R3"));
      Restaurant.addRating(new Rating(1, "R4"));
      Restaurant.addRating(new Rating(1, "R5"));
      assertThat(Restaurant.toString()).contains("MacDo", "Fast food", "5", "2");
   }
}