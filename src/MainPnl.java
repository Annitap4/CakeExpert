import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;

public class MainPnl extends JPanel {

	private EventListenerList eventListenerList = new EventListenerList();

	public MainPnl() {
		initGUI();
	}

	private void initGUI() {
		
		setLayout(new GridBagLayout());
		setBackground(new Color(252, 243, 218));
		GridBagConstraints gbc;

		JLabel txtLbl = new JLabel(new ImageIcon(getClass().getResource(
				"/images/wish.png")));
		txtLbl.setPreferredSize(new Dimension(800, 100));
		txtLbl.setAlignmentX(CENTER_ALIGNMENT);
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 0; 
		gbc.gridwidth = 3; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(txtLbl, gbc);

		JButton btnBread = new JButton("Torta de Pan", new ImageIcon(getClass()
				.getResource("/images/bread.png")));
		btnBread.setPreferredSize(new Dimension(285, 110));
		btnBread.setBorderPainted(false);
		btnBread.setBackground(new Color(255, 251, 156));
		btnBread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBreadClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		add(btnBread, gbc);

		JButton btnThreeMilk = new JButton("Torta 3 Leches", new ImageIcon(
				getClass().getResource("/images/3Milk.png")));
		btnThreeMilk.setPreferredSize(new Dimension(285, 110));
		btnThreeMilk.setBackground(new Color(145, 113, 92));
		btnThreeMilk.setBorderPainted(false);
		btnThreeMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnThreeMilkClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		add(btnThreeMilk, gbc);

		JButton btnChocolate = new JButton("Torta de Chocolate", new ImageIcon(
				getClass().getResource("/images/chocolate.png")));
		btnChocolate.setPreferredSize(new Dimension(285, 110));
		btnChocolate.setBackground(new Color(255, 251, 156));
		btnChocolate.setBorderPainted(false);
		btnChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnChocolateClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		add(btnChocolate, gbc);

		JButton btnPumpkin = new JButton("Torta de Auyama", new ImageIcon(
				getClass().getResource("/images/pumpkin.png")));
		btnPumpkin.setBackground(new Color(145, 113, 92));
		btnPumpkin.setPreferredSize(new Dimension(285, 110));
		btnPumpkin.setBorderPainted(false);
		btnPumpkin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPumpkinClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		add(btnPumpkin, gbc);

		JButton btnHomeMade = new JButton("Torta Casera", new ImageIcon(
				getClass().getResource("/images/homemade.png")));
		btnHomeMade.setPreferredSize(new Dimension(285, 110));
		btnHomeMade.setBackground(new Color(255, 251, 156));
		btnHomeMade.setBorderPainted(false);
		btnHomeMade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHomemadeClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		add(btnHomeMade, gbc);

		JButton btnPineApple = new JButton("Torta de Piña", new ImageIcon(
				getClass().getResource("/images/pineapple.png")));
		btnPineApple.setPreferredSize(new Dimension(285, 110));
		btnPineApple.setBackground(new Color(145, 113, 92));
		btnPineApple.setBorderPainted(false);
		btnPineApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPineappleClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		add(btnPineApple, gbc);

	}

	private void btnPineappleClicked() {
		fireActionEvent(new ActionEvent(this, 0,
				TopBarPnl.cakes.Pineapple.name()));
	}

	private void btnHomemadeClicked() {
		fireActionEvent(new ActionEvent(this, 0,
				TopBarPnl.cakes.Homemade.name()));
	}

	private void btnPumpkinClicked() {
		fireActionEvent(new ActionEvent(this, 0, TopBarPnl.cakes.Pumpkin.name()));
	}

	private void btnChocolateClicked() {
		fireActionEvent(new ActionEvent(this, 0,
				TopBarPnl.cakes.Chocolate.name()));
	}

	private void btnThreeMilkClicked() {
		fireActionEvent(new ActionEvent(this, 0,
				TopBarPnl.cakes.ThreeMilk.name()));
	}

	private void btnBreadClicked() {
		fireActionEvent(new ActionEvent(this, 0, TopBarPnl.cakes.Bread.name()));
	}

	public void addActionListener(ActionListener listener) {
		eventListenerList.add(ActionListener.class, listener);
	}

	public void removeActionListener(ActionListener listener) {
		eventListenerList.remove(ActionListener.class, listener);
	}

	public ActionListener[] getActionListeners() {
		return eventListenerList.getListeners(ActionListener.class);
	}

	private void fireActionEvent(ActionEvent evt) {
		ActionListener[] actionListeners = getActionListeners();

		for (ActionListener actionListener : actionListeners) {
			actionListener.actionPerformed(evt);
		}
	}

}
