package command;

import mvc.Line;

public class UpdateLineCmd implements Command{
	private Line oldLine;
	private Line newLine;
	private Line original = new Line();

	@Override
	public void execute() {
		original.setStartPoint(oldLine.getStartPoint());
		original.setEndPoint(oldLine.getEndPoint());
		
		oldLine.setStartPoint(newLine.getStartPoint());
		oldLine.setEndPoint(newLine.getEndPoint());
		
	}

	@Override
	public void unexecute() {
		oldLine.setStartPoint(original.getStartPoint());
		oldLine.setEndPoint(original.getEndPoint());
		
	}

}
