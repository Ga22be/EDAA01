package fractal;

import mountain.Mountain;
import mountain.Point;
import mountain.StraightMountain;
import koch.Koch;

public class FractalApplication {
	public static void main(String[] args) {
		Fractal[] fractals = new Fractal[3];
		fractals[0] = new Koch(300);
		fractals[1] = new StraightMountain(new Point(150,450), new Point(260,190), new Point(500,500));
		fractals[2] = new Mountain(40, new Point(150,450), new Point(260,190), new Point(500,500));
	    new FractalView(fractals, "Fraktaler");
	}

}
