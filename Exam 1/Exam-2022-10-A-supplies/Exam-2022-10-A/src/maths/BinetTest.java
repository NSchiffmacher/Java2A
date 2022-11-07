package maths;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BinetTest implements WithAssertions {

   @ParameterizedTest
   @CsvSource({
      "0, 0",
      "1, 1",
      "2, 1",
      "3, 2",
      "4, 3",
      "5, 5",
      "6, 8",
      "7, 13",
      "8, 21",
      "9, 34",
      "10, 55",
      "11, 89",
      "12, 144",
      "13, 233",
      "14, 377",
      "15, 610",
      "16, 987"
   })
   void testBinet(int n, double expected) {
      assertThat(Binet.fibonacci(n)).isEqualTo(expected, within(0.49));
   }
}
