package mountain;

import fractal.Fractal;
import fractal.TurtleGraphics;

public class StraightMountain extends Fractal{
	private Point p1;
	private Point p2;
	private Point p3;
	
	private int length;
	
	public StraightMountain(int length, Point p1, Point p2, Point p3){
		super();
		this.length = length;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public String getTitle() {
		return "Fucking berg";
	}

	@Override
	public void draw(TurtleGraphics turtle) {
		double wOffset = Math.hypot(p3.getX()-p1.getX(), p3.getY() - p1.getY());
		double hOffset = Math.hypot(p1.getX()- p2.getX(), p1.getY() - p2.getY());
		turtle.moveTo(turtle.getWidth() / 2.0 - wOffset / 2.0,
				turtle.getHeight() / 2.0 + Math.sqrt(3.0) * hOffset / 4.0);
	}
	
	/** 
	 * Reursive method: Draws a recursive line of the triangle. 
	 */
	private void fractalLine(TurtleGraphics turtle, int order) {
		if(order == 0){
			
		} else {
			
		}
	}

}
