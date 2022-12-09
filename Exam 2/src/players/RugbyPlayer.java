package players;

import java.util.Objects;

public class RugbyPlayer implements Comparable<RugbyPlayer>{
   private String fullname;
   private int weight;

   public RugbyPlayer(String fullname, int weight) {
      this.fullname     = fullname;
      this.weight       = weight;
   }

   public String toString(){
      return this.fullname + " (" + this.weight + "kg)";
   }

   @Override
   public int compareTo(RugbyPlayer other) {
      if (this == other)
         return 0;

      // First compare on the weight
      if (this.weight != other.weight) {
         return Integer.compare(other.weight, this.weight); // other first to get descending order
      }

      // Otherwise compare on fullname (ascending)
      return this.fullname.compareTo(other.fullname);
   }

   @Override
   public boolean equals(Object other) {
      if (other == this)
         return true;
   
      if (!(other instanceof RugbyPlayer)) {
         return false;
      }
   
      RugbyPlayer other_player = (RugbyPlayer) other;
      return this.weight == other_player.weight && this.fullname == other_player.fullname; 
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.weight, this.fullname); 
   }


}
