package meteo;

public class MeteoSample {
	private double temperature;
	private double pressure;
	private double humidity;

	private void assertDomain(String description, String unité, double value, double min, double max){
		if (value > max || value < min)
			throw new IllegalArgumentException("Le paramètre \"" + description + "\" doit avoir une valeur entre " + min + unité + " et " + max + unité);
	}

	public MeteoSample(double t, double p, double h) {
		// Delegates the verification to a function not to repeat the same code thrice
		this.assertDomain("température", "°C", t, -237.15, 60);
		this.assertDomain("pression atmosphérique", " hPa", p, 870, 1086.8);
		this.assertDomain("taux d'humidité", "%", h, 0, 100);

		this.temperature 	= t;
		this.pressure 		= p;
		this.humidity 		= h;
	}

	public String toString(){
		return temperature + "°C, " + pressure + " hPa, " + this.humidity + "% humidity";
	}
	
}
