package mountain;

import java.util.*;

import fractal.Fractal;
import fractal.TurtleGraphics;

public class Mountain extends Fractal {
	private Point p1;
	private Point p2;
	private Point p3;
	private int dev;
	private List<Side> sides;
	private int level;

	public Mountain(int dev, Point p1, Point p2, Point p3) {
		super();
		this.dev = dev;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		sides = new LinkedList<Side>();
		level = 0;
	}

	@Override
	public String getTitle() {
		return "Fucking snett berg";
	}

	@Override
	public void draw(TurtleGraphics turtle) {
		turtle.moveTo(p1.getX(), p1.getY());
		fractalTriangle(turtle, order, dev, p1, p2, p3, level);
	}

	/**
	 * Recursive method: Draws a recursive line of the triangle.
	 */
	private void fractalTriangle(TurtleGraphics turtle, int order, int dev,
			Point p1, Point p2, Point p3, int level) {
		if (order == 0) {
			turtle.moveTo(p1.getX(), p1.getY());
			turtle.penDown();
			turtle.forwardTo(p2.getX(), p2.getY());
			turtle.forwardTo(p3.getX(), p3.getY());
			turtle.forwardTo(p1.getX(), p1.getY());
			turtle.penUp();
			setLevel(level);
			System.out.println(sides.size());
		} else {
			double offset1 = RandomUtilities.randFunc(dev);
			double offset2 = RandomUtilities.randFunc(dev);
			double offset3 = RandomUtilities.randFunc(dev);
			dev /= 2;
			Point mLeft;
			Point mRight;
			Point mBottom;

			// Calc left middle point
			mLeft = getMPoint(p1, p2, offset1, level);
			// Calc right middle point
			mRight = getMPoint(p2, p3, offset2, level);
			// Calc bottom middle point
			mBottom = getMPoint(p1, p3, offset3, level);
			
			// Top
			fractalTriangle(turtle, order - 1, dev, mLeft, p2, mRight, level + 1);
			// Middle
			fractalTriangle(turtle, order - 1, dev, mLeft, mRight, mBottom, level + 1);
			// Bottom left
			fractalTriangle(turtle, order - 1, dev, p1, mLeft, mBottom, level + 1);
			// Bottom right
			fractalTriangle(turtle, order - 1, dev, mBottom, mRight, p3, level + 1);
		}
	}
	
	private Point getMPoint(Point p1, Point p2, double offset, int level){
		Side test = new Side(p1, p2);
		int index = sides.indexOf(test);
		if (index >= 0 ) {
			Point temp = sides.get(index).getMPoint();
			return temp;
		} else {
			Point temp = new Point((p1.getX() + p2.getX()) / 2.0,
					((p1.getY() + p2.getY()) / 2.0) + offset);
			sides.add(new Side(p1, p2, temp, level));
			return temp;
		}
	}
	
	private void setLevel(int level){
		Iterator<Side> itr = sides.iterator();
		while(itr.hasNext()){
			Side temp = itr.next();
			if(temp.getLevel() >= level){
				itr.remove();
			}
		}
	}
}
