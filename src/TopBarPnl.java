import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TopBarPnl extends JPanel {

	public enum cakes {
		Welcome, Bread, Chocolate, ThreeMilk, Pumpkin, Homemade, Pineapple
	}

	public static ImageIcon cakeImg;
	public static ImageIcon textImg;
	public cakes cake;

	public TopBarPnl() {
		cake = cakes.Welcome;
	}

	public void draw(Graphics2D g2d) {
		g2d.setColor(new Color(79, 39, 3));
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setColor(new Color(255, 251, 156));
		g2d.fillRect(4, 4, getWidth() - 8, getHeight() - 8);
		switch (cake) {
		case Welcome:
			cakeImg = new ImageIcon(getClass().getResource("/images/cake.png"));
			textImg = new ImageIcon(getClass().getResource(
					"images/welcomeTxt.png"));
			break;
		case Bread:
			cakeImg = new ImageIcon(getClass().getResource("/images/bread.png"));
			textImg = new ImageIcon(getClass().getResource(
					"images/breadTxt.png"));
			break;
		case ThreeMilk:
			cakeImg = new ImageIcon(getClass().getResource("/images/3Milk.png"));
			textImg = new ImageIcon(getClass().getResource(
					"/images/threeMilkTxt.png"));
			break;
		case Chocolate:
			cakeImg = new ImageIcon(getClass().getResource("/images/chocolate.png"));
			textImg = new ImageIcon(getClass().getResource("/images/chocolateTxt.png"));
			break;
		case Homemade:
			cakeImg = new ImageIcon(getClass().getResource("/images/homemade.png"));
			textImg = new ImageIcon(getClass().getResource("/images/homemadeTxt.png"));
			break;
		case Pumpkin:
			cakeImg = new ImageIcon(getClass().getResource("/images/pumpkin.png"));
			textImg = new ImageIcon(getClass().getResource("/images/pumpkinTxt.png"));
			break;
		case Pineapple:
			cakeImg = new ImageIcon(getClass().getResource("/images/pineapple.png"));
			textImg = new ImageIcon(getClass().getResource("/images/pineappleTxt.png"));
			repaint();
			break;
		default:
			cakeImg = new ImageIcon(getClass().getResource("/images/cake.png"));
			textImg = new ImageIcon(getClass().getResource(
					"/images/welcomeTxt.png"));
			break;
		}
		g2d.drawImage(cakeImg.getImage(), 1, 5, null);
		g2d.drawImage(textImg.getImage(), 130, 5, null);
	}

	public void paint(Graphics g) {
		update(g);
	}

	public void update(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		draw(g2d);
	}

	public void setBreadCake() {
		cake = cakes.Bread;
		repaint();
	}

	public void setThreeMilkCake() {
		cake = cakes.ThreeMilk;
		repaint();
	}

	public void setChocolateCake() {
		cake = cakes.Chocolate;
		repaint();
	}

	public void setHomemadeCake() {
		cake = cakes.Homemade;
		repaint();
	}

	public void setPumpkinCake() {
		cake = cakes.Pumpkin;
		repaint();
	}

	public void setWelcome() {
		cake = cakes.Welcome;
		repaint();
	}

	public void setPineappleCake() {
		cake = cakes.Pineapple;
		repaint();
	}
}
