package bisection;

public class Bisection {

	/**
	 * Beräkna nollstället för funktionen f i intervallet low..high med
	 * precisionen eps. Förutsätter att det finns ett nollställe i intervallet.
	 */
	public static double getZero(double low, double high, double eps, Function f) {
		if((high-low)/2 < eps){
			return (high+low)/2;
		} else {
			double m = (low+high)/2;
			if((f.evaluate(low) * f.evaluate(m) > 0)){
				return getZero(m, high, eps, f);
			} else {
				return getZero(low, m, eps, f);
			}
		}
	}

}
