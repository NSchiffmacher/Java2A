package restaurants;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(OrderAnnotation.class)
public class BasicRatingTest implements WithAssertions {

   @ParameterizedTest
   @CsvSource({
      "1, Comment one",
      "2, Comment two",
      "3, Comment three",
      "4, Comment four",
   })
   @Order(1)
   public void testRatingCreation(int quality, String comment) {
      Rating rating = new Rating(quality, comment);
      assertThat(rating).isNotNull();
      assertThat(rating).extracting("comment").isEqualTo(comment);
      assertThat(rating).extracting("quality").isEqualTo(quality);
      assertThat(rating.getQuality()).isEqualTo(quality);
      assertThat(rating.toString()).contains(comment, Integer.toString(quality), "4");
   }

   @ParameterizedTest
   @CsvSource({
      "0, Comment zero",
      "-51, Comment minus fifty one",
   })
   @Order(2)
   public void testRatingCreation_WithLowQualities(int quality, String comment) {
      Rating rating = new Rating(quality, comment);
      assertThat(rating).isNotNull();
      assertThat(rating).extracting("comment").isEqualTo(comment);
      assertThat(rating).extracting("quality").isEqualTo(1);
      assertThat(rating.getQuality()).isEqualTo(1);
      assertThat(rating.toString()).contains(comment, "1", "4");
   }


   @ParameterizedTest
   @CsvSource({
      "5, Comment five",
      "42, Comment forty two",
   })
   @Order(3)
   public void testRatingCreation_WithHighQualities(int quality, String comment) {
      Rating rating = new Rating(quality, comment);
      assertThat(rating).isNotNull();
      assertThat(rating).extracting("comment").isEqualTo(comment);
      assertThat(rating).extracting("quality").isEqualTo(4);
      assertThat(rating.getQuality()).isEqualTo(4);
      assertThat(rating.toString()).contains(comment, "4", "4");
   }
}