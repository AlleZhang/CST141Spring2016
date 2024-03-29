
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point (Point point) {
		this.x = point.getX();
		this.y = point.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point deepCopy() {
		return new Point (this.x, this.y);
	}
	
	public Point shallowCopy() {
		return this;
	}
	
	public Point deepCopy(Point point) {
		return new Point (point);
	}
	
	public Point shallowCopy(Point point) {
		return point;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ",y=" + y + "]";
	}
	
	

}
