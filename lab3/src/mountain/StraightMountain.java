package mountain;

import fractal.Fractal;
import fractal.TurtleGraphics;

public class StraightMountain extends Fractal {
	private Point p1;
	private Point p2;
	private Point p3;

	public StraightMountain(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public String getTitle() {
		return "Berg";
	}

	@Override
	public void draw(TurtleGraphics turtle) {
		fractalTriangle(turtle, order, p1, p2, p3);
	}

	/**
	 * Recursive method: Draws a recursive triangle.
	 */
	private void fractalTriangle(TurtleGraphics turtle, int order, Point p1,
			Point p2, Point p3) {
		if (order == 0) {
			turtle.moveTo(p1.getX(), p1.getY());
			turtle.penDown();
			turtle.forwardTo(p2.getX(), p2.getY());
			turtle.forwardTo(p3.getX(), p3.getY());
			turtle.forwardTo(p1.getX(), p1.getY());
			turtle.penUp();
		} else {
			Point mLeft = new Point((p1.getX() + p2.getX()) / 2.0, (p1.getY() + p2.getY()) / 2.0);
			Point mRight = new Point((p2.getX() + p3.getX()) / 2.0, (p2.getY() + p3.getY()) / 2.0);
			Point mBottom = new Point((p1.getX() + p3.getX()) / 2.0, (p1.getY() + p3.getY()) / 2.0);
			// Top
			fractalTriangle(turtle, order - 1, mLeft, p2, mRight);
			// Middle
			fractalTriangle(turtle, order - 1, mLeft, mRight, mBottom);
			// Bottom left
			fractalTriangle(turtle, order - 1, p1, mLeft, mBottom);
			// Botom right
			fractalTriangle(turtle, order - 1, mBottom, mRight, p3);
		}
	}
}
