package recursion;

public class Rent {
	public static double computeCapital(double capital, int years,
			double interestRate) {
		if(years == 0){
			return capital;
		} else {
			return interestRate * computeCapital(capital, years-1, interestRate);
		}
	}
}
