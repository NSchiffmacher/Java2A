package geometry;

import fr.supaero.matchers.assertions.TypeAssertions;

import org.assertj.core.api.WithAssertions;
import org.assertj.core.api.WithAssumptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import fr.supaero.matchers.utils.TypeInfo;

public class PolylineTest implements WithAssertions, WithAssumptions {

   private static final double EPSILON = 1e-9;

   /* Behavioral tests */

   @Test
   public void constructorShouldMakeEmptyList() {
      Polyline polyline = new Polyline();
      assertThat(polyline).extracting("edges").asList().isEmpty();
      assertThat(polyline.size()).isEqualTo(0);
      assertThat(polyline.length()).isEqualTo(0.0, withPrecision(EPSILON));
   }

   @Test
   public void addEdgeShouldAppend() {
      Polyline polyline = new Polyline();
      polyline.addEdge(new Position(1, 0));
      assertThat(polyline).extracting("edges").asList().size().isEqualTo(1);
      polyline.addEdge(new Position(2, 0));
      assertThat(polyline).extracting("edges").asList().size().isEqualTo(2);
      polyline.addEdge(new Position(3, 0));
      assertThat(polyline).extracting("edges").asList().size().isEqualTo(3);
      polyline.addEdge(new Position(4, 0));
      assertThat(polyline).extracting("edges").asList().size().isEqualTo(4);
   }

   @Test
   public void addEdgeShouldAppendInOrder() {
      Polyline polyline = new Polyline();
      Position p1 = new Position(1, 0);
      Position p2 = new Position(2, 0);
      Position p3 = new Position(3, 0);
      Position p4 = new Position(4, 0);
      polyline.addEdge(p1);
      assertThat(polyline).extracting("edges").asList().contains(p1);
      polyline.addEdge(p2);
      assertThat(polyline).extracting("edges").asList().contains(p1, p2);
      polyline.addEdge(p3);
      assertThat(polyline).extracting("edges").asList().contains(p1, p2, p3);
      polyline.addEdge(p4);
      assertThat(polyline).extracting("edges").asList().contains(p1, p2, p3, p4);
   }

   @Test
   public void testSize() {
      Polyline polyline = new Polyline();
      assertThat(polyline.size()).isEqualTo(0);
      polyline.addEdge(new Position(1, 1));
      assertThat(polyline.size()).isEqualTo(1);
      polyline.addEdge(new Position(2, 2));
      assertThat(polyline.size()).isEqualTo(2);
      polyline.addEdge(new Position(3, 3));
      assertThat(polyline.size()).isEqualTo(3);
   }

   @Test
   public void testLength() {
      Polyline polyline = new Polyline();
      assertThat(polyline.length()).isEqualTo(0, withPrecision(EPSILON));
      polyline.addEdge(new Position(1, 0));
      assertThat(polyline.length()).isEqualTo(0, withPrecision(EPSILON));
      polyline.addEdge(new Position(3, 0));
      assertThat(polyline.length()).isEqualTo(2, withPrecision(EPSILON));
      polyline.addEdge(new Position(3, 4));
      assertThat(polyline.length()).isEqualTo(6, withPrecision(EPSILON));
   }

   @Test
   public void testClearEdges() {
      Polyline polyline = new Polyline();
      polyline.addEdge(new Position(1, 0));
      polyline.addEdge(new Position(3, 0));
      polyline.addEdge(new Position(3, 4));
      polyline.clearEdges();
      assertThat(polyline).extracting("edges").asList().size().isEqualTo(0);
      assertThat(polyline.size()).isEqualTo(0);
      assertThat(polyline.length()).isEqualTo(0, withPrecision(EPSILON));
   }


   @Test
   public void testToString() {
      Polyline polyline = new Polyline();
      assertThat(polyline.toString()).containsSubsequence("[]");
      polyline.addEdge(new Position(1, 1));
      assertThat(polyline.toString()).containsSubsequence("[(1.0,1.0)]", "0.0");
      polyline.addEdge(new Position(1, 4));
      assertThat(polyline.toString()).containsSubsequence("[", "(1.0,1.0)", "(1.0,4.0)", "]", "2", "3.0");
   }

   /* Visibility / encapsulation tests */

   private TypeInfo typeInfo = TypeInfo.info(Polyline.class);

   @Test
   public void classShouldBePublic() {
      TypeAssertions.assertThat(typeInfo)
            .hasVisibility("public");
   }

   @CsvSource({
         "edges",
   })
   @ParameterizedTest
   public void attributesShouldBePrivate(String name) {
      TypeAssertions.assertThat(typeInfo)
            .field(name).hasVisibility("private");
   }

   @CsvSource(delimiter = ';', value = {
         "Polyline()",
   })
   @ParameterizedTest
   public void constructorsShouldBePublic(String signature) {
      TypeAssertions.assertThat(typeInfo)
            .constructor(signature).hasVisibility("public");
   }

   @CsvSource(delimiter = ';', value = {
         "addEdge(Position)",
         "clearEdges()",
         "size()",
         "length()",
         "toString()"
   })
   @ParameterizedTest
   public void methodsShouldBePublic(String signature) {
      TypeAssertions.assertThat(typeInfo)
            .method(signature).hasVisibility("public");
   }
}
