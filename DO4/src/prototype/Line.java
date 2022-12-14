package prototype;

import java.awt.Graphics;

import mvc.Point;

public class Line extends Shape implements Cloneable {
	private Point startPoint = new Point();
	private Point endPoint = new Point();

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line() {
		// TODO Auto-generated constructor stub
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public String toString() {
//		return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
//	}

	public Line clone() {
		try {
			Line line = (Line) super.clone();
			return line;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
