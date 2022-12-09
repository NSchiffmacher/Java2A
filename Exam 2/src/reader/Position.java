package reader;

public class Position {
   private double x;
   private double y;

   public Position(double x, double y) {
      this.x = x;
      this.y = y;
   }

   @Override
   public String toString() {
      return "(" + x + "," + y + ")";
   }
}
