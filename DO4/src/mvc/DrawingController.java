package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;

public class DrawingController {
	private DrawingModel model;
	private DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.RED);
		AddPointCmd addPointCmd = new AddPointCmd(p, model);
		addPointCmd.execute();
		//model.add(p);
		frame.repaint();
	}
	
}
