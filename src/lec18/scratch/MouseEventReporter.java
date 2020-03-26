package lec18.scratch;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventReporter implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse clicked: " + e.getClickCount() );
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited");
	}

}
