package deckofcards;

import java.awt.*;

public class GameWindow extends Frame {
	
	public GameWindow() {
		
		Frame f = new Frame("Sample Title");
		f.setSize(500, 500);
		
		f.setLocation(300, 50);
		
		Panel modeSelect = new Panel();
		
		Button gfButton = new Button("Play Go Fish");
		
		gfButton.addActionListener(null);
		
		modeSelect.add(gfButton);
		
		f.add(modeSelect);
		
		f.setVisible(true);
		
	}
	
}
