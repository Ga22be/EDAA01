package recursion;

public class Math {
	public static double power(double x, int n){
		if(n == 0){
			return 1;
		} else {
			if(n > 0){
				double temp = power(x, n/2);
				double mult = temp*temp;
				if(n%2 == 0){
					return mult;
				} else {
					return x*mult;
				}
			} else {
				return 1/power(x, -n);
			}
		}
	}
}
