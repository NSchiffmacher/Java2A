package collections;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class BasicQueueTest implements WithAssertions {

   @Test
   @Order(1)
   public void canCreateQueue() {
      Queue<String> q = new Queue<>();
      assertThat(q).extracting("elements")
            .isNotNull()
            .asList()
            .isEmpty();
   }

   @Test
   @Order(2)
   public void canEnqueue() {
      Queue<String> q = new Queue<>();
      q.enqueue("X");
      q.enqueue("Y");
      q.enqueue("Z");
      assertThat(q).extracting("elements")
            .asList()
            .contains("X", "Y", "Z");
   }

   @Test
   @Order(3)
   public void dequeueOrderIsOk() {
      Queue<String> q = new Queue<>();
      q.enqueue("X");
      q.enqueue("Y");
      q.enqueue("Z");
      assertThat(q.dequeue()).isEqualTo("X");
      assertThat(q).extracting("elements")
            .asList()
            .doesNotContain("X");
      assertThat(q.dequeue()).isEqualTo("Y");
      assertThat(q).extracting("elements")
            .asList()
            .doesNotContain("Y");
      assertThat(q.dequeue()).isEqualTo("Z");
      assertThat(q).extracting("elements")
            .asList()
            .doesNotContain("Z");

   }

   @Test
   @Order(4)
   public void testIsEmpty() {
      Queue<String> q = new Queue<>();
      assertThat(q.isEmpty()).isTrue();

      q.enqueue("X");
      assertThat(q.isEmpty()).isFalse();

      q.dequeue();
      assertThat(q.isEmpty()).isTrue();

      q.enqueue("Y");
      q.enqueue("Z");
      assertThat(q.isEmpty()).isFalse();

      q.dequeue();
      assertThat(q.isEmpty()).isFalse();
      q.dequeue();
      assertThat(q.isEmpty()).isTrue();
   }

   @Test
   @Order(5)
   public void dequeueEmptyQueueDoesNotBreakQueue() {
      Queue<String> q = new Queue<>();
      q.dequeue();
      q.enqueue("X");
      assertThat(q).extracting("elements")
            .asList()
            .contains("X");
   }
}
