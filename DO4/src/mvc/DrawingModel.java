package mvc;

import java.util.ArrayList;
import java.util.List;

public class DrawingModel {
	private List<Point> points = new ArrayList<>();
	
	public List<Point> getPoints() {
		return points;
	}

	public void add(Point p) {
		points.add(p);
	}
	
	public void remove(Point p) {
		points.remove(p);
	}

}
