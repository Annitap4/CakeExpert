import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class BreadAskPnl extends JPanel{
	
	public BreadAskPnl() {
		initGUI();
	}

	private void initGUI() {
	
		setLayout(new GridBagLayout());
		setBackground(new Color(252, 243, 218));
		GridBagConstraints gbc;
		
		JLabel txtLbl = new JLabel("¿Que hacer si...?");
		txtLbl.setFont(new Font("Time New Roman", Font.BOLD, 14));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; // Coordenada x en el grid
		gbc.gridy = 0; // Coordenada y en el grid
		gbc.gridwidth = 1; // Cantidad de celdas de ancho
		gbc.gridheight = 1; // Cantidad de celdas de alto
		gbc.weightx = 0; // Peso de la celda en horizontal
		gbc.weighty = 0; // Peso de la celda enla vertical
		gbc.anchor = GridBagConstraints.CENTER; // Ancla relativa a la celda
		gbc.fill = GridBagConstraints.NONE; // Como usa el espacio disponible
		gbc.insets = new Insets(1, 1, 1, 1); // Espacios que reserva el
												// componente entre el borde del
												// objeto y la celda
		add(txtLbl, gbc);
		
		JRadioButton r1 = new JRadioButton("Huevos podridos");
		r1.setBackground(new Color(252, 243, 218));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 1; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r1, gbc);
		
		JRadioButton r2 = new JRadioButton("Huevos podridos");
		r2.setBackground(new Color(252, 243, 218));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 2; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r2, gbc);
		
		JRadioButton r3 = new JRadioButton("Huevos podridos");
		r3.setBackground(new Color(252, 243, 218));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 3; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r3, gbc);
		
		JRadioButton r4 = new JRadioButton("Huevos podridos");
		r4.setBackground(new Color(252, 243, 218));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 4; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r4, gbc);
		
		JRadioButton r5 = new JRadioButton("Huevos podridos");
		r5.setBackground(new Color(252, 243, 218));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 5; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r5, gbc);
		
		JRadioButton r6 = new JRadioButton("Huevos podridos");
		r6.setBackground(new Color(252, 243, 218));
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 6; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1);
		add(r6, gbc);
	}

}
