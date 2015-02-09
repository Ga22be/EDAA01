package bisection;

public class BisectionTest {

	public static void main(String[] args) {
		Function f = new ImplementedFunction();
		
		System.out.println(Bisection.getZero(0, 1.6, 0.00001, f));

	}

}
