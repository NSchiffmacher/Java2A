package rationals;

import java.util.TreeSet;
import java.util.Comparator;

public class EgyptianFraction {
    private TreeSet<Rational> unitFractions;

    public EgyptianFraction(){
        this.unitFractions = new TreeSet<>(new DenumComparator());
    }

    public void addUnitFraction(int denom){
        this.unitFractions.add(new Rational(1, denom));
    }

    public String toString(){
        return unitFractions.toString().replace("[", "").replace("]", "").replace(","," +");
    }

    class DenumComparator implements Comparator<Rational> {
        public int compare(Rational rat1, Rational rat2) {
            return Double.compare(rat1.getDenom(), rat2.getDenom());
        }
    }
}
