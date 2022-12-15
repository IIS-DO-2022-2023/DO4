package prototype;

import java.awt.Color;

import mvc.Point;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.RED);

		Line line = new Line(p1, p2);

		Line line2 = line.clone();

		System.out.println(line);
		System.out.println(line2);

		line.getStartPoint().setX(100);

		System.out.println(line2.getStartPoint().getX());

		LineDeep lineDeep = new LineDeep(p1, p2);

		LineDeep lineDeep2 = lineDeep.clone();

		lineDeep.getStartPoint().setX(200);

		System.out.println(lineDeep2.getStartPoint().getX());

	}

}
