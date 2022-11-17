package command;

import mvc.DrawingModel;
import mvc.Point;

public class RemovePointCmd implements Command {
	private Point point;
	private DrawingModel model;
	
	public RemovePointCmd(Point point, DrawingModel drawingModel) {
		this.point = point;
		this.model = drawingModel;
	}

	@Override
	public void execute() {
		model.remove(point);
	}

	@Override
	public void unexecute() {
		model.add(point);
	}

}
