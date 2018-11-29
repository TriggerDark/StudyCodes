package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import com.view.MainFrame;

public class FrameMouseMotionListener implements MouseMotionListener {
		
	public MainFrame mainframe;
	
	public void mouseDragged(MouseEvent e) {
		mainframe.panel.player.x = e.getX() - mainframe.panel.player.width/2;
		mainframe.panel.player.y = e.getY() - mainframe.panel.player.height/2;
	}

	public void mouseMoved(MouseEvent arg0) {
		
	}
	
}
