package bisection;

public class ImplementedFunction implements Function {
	
	public ImplementedFunction() {
	}

	@Override
	public double evaluate(double x) {
		double result = Math.exp(-x) - 1 + Math.cos(x);
		return result;
	}

}
