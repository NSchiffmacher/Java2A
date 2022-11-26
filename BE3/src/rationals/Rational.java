package rationals;

import java.util.Objects;
import java.lang.Comparable;

public class Rational implements Comparable<Rational>{

	private int num;
	private int denom;

	public Rational(int num, int denom) {
		if (denom <= 0) throw new IllegalArgumentException("Denominator can't be negative or zero");


		int pgcd = this.gcd(num, denom);
		this.num = num / pgcd;
		this.denom = denom / pgcd;
	}

	public Rational(int nb) {
		this.num = nb;
		this.denom = 1;
	}

	public int getNum() {
		return num;
	}

	public int getDenom() {
		return denom;
	}

	private int gcd(int a, int b) { //should be static ?
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		
		if (!(o instanceof Rational))
			return false;
		
		Rational other = (Rational) o;
		return this.num * other.denom == this.denom * other.num; // uses x and y
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.num, this.denom);
	}

	@Override
	public int compareTo(Rational other){
		return Double.compare(this.num * other.denom, this.denom * other.num);
	}

	@Override
	public String toString() {
		if (denom != 1) {
			return num + "/" + denom;
		} else {
			return num + "";
		}
	}

	/**
	 * Converts "1/3" or "4" to the corresponding rational.
	 */
	static public Rational parseRational(String s) {
		if (s.contains("/")) {
			String[] fraction = s.split("/");
			int num = Integer.parseInt(fraction[0]);
			int denom = Integer.parseInt(fraction[1]);
			return new Rational(num, denom);
		} else {
			int num = Integer.parseInt(s);
			return new Rational(num);
		}
	}

}
