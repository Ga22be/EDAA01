package mountain;

public class Side {
	private Point p1;
	private Point p2;
	private Point m;

	public Side(Point p1, Point p2, Point m) {
		this.p1 = p1;
		this.p2 = p2;
		this.m = m;
	}
	
	public Side(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Point getMPoint(){
		return m;
	}

	public boolean equals(Object x) {
		if (x instanceof Side) {
			Side s = (Side) x; 
				return p1.equals(s.p1) && p2.equals(s.p2);
		} else {			
			return false;
		}
	}
	
	public String toString(){
		String temp = "[" + p1.toString() + p2.toString() + m.toString() + "]";
		return temp;
	}
}