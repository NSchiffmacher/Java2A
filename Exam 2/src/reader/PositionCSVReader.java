package reader;

public class PositionCSVReader extends AbstractLineReader<Position> {
    public PositionCSVReader() {
        super("position");
     }
  
     @Override
     protected Position getElementFromLine(String line) {
         String[] tokens = line.split(",");

         double x = Double.parseDouble(tokens[0]);
         double y = Double.parseDouble(tokens[1]);

         return new Position(x, y);
     }
}
