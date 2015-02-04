package fractal;

import mountain.Point;
import mountain.StraightMountain;
import koch.Koch;

public class FractalApplication {
	public static void main(String[] args) {
		Fractal[] fractals = new Fractal[2];
		fractals[0] = new Koch(300);
		fractals[1] = new StraightMountain(300, new Point(150,450), new Point(300,150), new Point(450,450));
	    new FractalView(fractals, "Fraktaler");
	}

}
