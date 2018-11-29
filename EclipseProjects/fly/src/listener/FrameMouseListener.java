package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.view.MainFrame;

public class FrameMouseListener implements MouseListener {

	public MainFrame mainframe;
	
	public void mouseClicked(MouseEvent e) {
		mainframe.panel.player.x = e.getX() - mainframe.panel.player.width/2;
		mainframe.panel.player.y = e.getY() - mainframe.panel.player.height/2 - 10;
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
	
}
