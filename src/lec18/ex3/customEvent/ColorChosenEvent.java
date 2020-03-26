package lec18.ex3.customEvent;

import java.awt.Color;

public class ColorChosenEvent {

	private Color _oldColor;
	private Color _newColor;

	public ColorChosenEvent(Color oldColor, Color newColor) {
		_oldColor = oldColor;
		_newColor = newColor;
	}
	
	public Color getOldColor() {
		return _oldColor;
	}

	public Color getNewColor() {
		return _newColor;
	}

}
