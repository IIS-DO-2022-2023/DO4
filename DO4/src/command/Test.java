package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.BLACK);
		DrawingModel model = new DrawingModel();

		AddPointCmd addPointCmd = new AddPointCmd(p1, model);

		addPointCmd.execute();

		System.out.println(model.getShapes().size());

		addPointCmd.unexecute();

		System.out.println(model.getShapes().size());

		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);

		updatePointCmd.execute();

		System.out.println(p1);
		System.out.println(p2);

		updatePointCmd.unexecute();

		System.out.println(p1);
		System.out.println(p2);

		Point p3 = new Point(30, 30, Color.RED);
		Point p4 = new Point(40, 40, Color.BLACK);

		Line lin1 = new Line(p1, p2);
		Line lin2 = new Line(p3, p4);

		UpdateLineCmd updateLineCmd = new UpdateLineCmd(lin1, lin2);
		updateLineCmd.execute();

		System.out.println(lin1);

		p3.setX(100);

		System.out.println(lin1);
	}

}
