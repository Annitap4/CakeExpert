import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.event.EventListenerList;


public class PineappleAskPnl extends JPanel {
	
	private EventListenerList eventListenerList = new EventListenerList();
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	private JRadioButton r4;
	private JTextArea l1;
	private JTextArea l2;
	private JTextArea l3;
	private JTextArea l4;
	private JLabel txtLbl;
	
	public PineappleAskPnl() {
		initGUI();
	}

	private void initGUI() {
	
		setLayout(new GridBagLayout());
		setBackground(new Color(252, 243, 218));
		GridBagConstraints gbc;
		
		JLabel img1 = new JLabel(new ImageIcon(getClass().getResource("/images/slide14.png")));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 0; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 14;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(img1, gbc);
		
		JLabel img2 = new JLabel(new ImageIcon(getClass().getResource("/images/slide15.png")));
		gbc = new GridBagConstraints();
		gbc.gridx = 2; 
		gbc.gridy = 0; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 14;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(img2, gbc);
		
		
		txtLbl = new JLabel("¿Que hacer si...?");
		txtLbl.setFont(new Font("Time New Roman", Font.BOLD, 18));
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 0; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1); 
		add(txtLbl, gbc);
		
		r1 = new JRadioButton("...no tiene piña conservada en lata");
		r1.setBackground(new Color(252, 243, 218));
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rb1Clicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 2; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r1, gbc);
		
		l1 = new JTextArea();
		l1.setText("- Se puede sustituir por ruedas de piña natural \npreparadas en almibar (Se ponen a hervir con \nagua y azucar)");
		l1.setBackground(new Color(252, 243, 218));
		l1.setVisible(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 3; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(l1, gbc);
		
		r2 = new JRadioButton("...un huevo se encuentra en mal estado");
		r2.setBackground(new Color(252, 243, 218));
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rb2Clicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 4; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r2, gbc);
		
		l2 = new JTextArea();
		l2.setBackground(new Color(252, 243, 218));
		l2.setText("- Si aun no se ha colocado en la mezcla \ndescartarlo, en caso contrario volver a iniciar la \npreparación y desechar lo hecho");
		l2.setVisible(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 5; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(l2, gbc);
		
		r3 = new JRadioButton("...no tiene guindas al alcance");
		r3.setBackground(new Color(252, 243, 218));
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rb3Clicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 8; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r3, gbc);
		
		l3 = new JTextArea();
		l3.setText("- Puede prescindir de ellas");
		l3.setVisible(false);
		l3.setBackground(new Color(252, 243, 218));
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 9; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(l3, gbc);
		
		r4 = new JRadioButton("...la torta se paso de coción");
		r4.setBackground(new Color(252, 243, 218));
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rb4Clicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 10; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r4, gbc);
		
		l4 = new JTextArea();
		l4.setText("- Intente recortar el fondo de la torta al rededor \nde medio centímetro hasta remover la corteza \nquemada");
		l4.setBackground(new Color(252, 243, 218));
		l4.setVisible(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 11; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(l4, gbc);
		
		JButton btnBack = new JButton(new ImageIcon(getClass().getResource("/images/back.png")));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(new Color(252, 243, 218));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked();
				
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 14; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(btnBack, gbc);
		
	}

	private void rb1Clicked() {
		l1.setVisible(true);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		r2.setSelected(false);
		r3.setSelected(false);
		r4.setSelected(false);
		repaint();
	}
	
	private void rb2Clicked() {
		l1.setVisible(false);
		l2.setVisible(true);
		l3.setVisible(false);
		l4.setVisible(false);
		r1.setSelected(false);
		r3.setSelected(false);
		r4.setSelected(false);
		repaint();
	}
	
	private void rb3Clicked() {
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(true);
		l4.setVisible(false);
		r1.setSelected(false);
		r2.setSelected(false);
		r4.setSelected(false);
		repaint();
	}
	
	private void rb4Clicked() {
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(true);
		r1.setSelected(false);
		r2.setSelected(false);
		r3.setSelected(false);
		repaint();
	}
	
	private void btnBackClicked() {
		fireActionEvent(new ActionEvent(this, 0, CenterPnl.BACK));
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
