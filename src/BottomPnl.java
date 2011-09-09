import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;

import javax.swing.JPanel;


public class BottomPnl extends JPanel {
	
	public BottomPnl() {
		add(new Label("Universidad de Los Andes"));
		setBackground(new Color(255,251,156));
	}
	
	public void draw(Graphics2D g2d) {
		g2d.setColor(new Color(79,39,3));
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setColor(new Color(255,251,156));
		g2d.fillRect(2, 2, getWidth() - 3, getHeight() - 3);
		
	}
	
	public void paint(Graphics g) {
		update(g);
	}

	public void update(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		draw(g2d);
	}

}
