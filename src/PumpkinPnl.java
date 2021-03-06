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
import javax.swing.JTextArea;
import javax.swing.event.EventListenerList;


public class PumpkinPnl extends JPanel {
	
	private EventListenerList eventListenerList = new EventListenerList();
	private JPanel pumpkinPnl;
	private PumpkinAskPnl pumpkinAskPnl;
	
	public PumpkinPnl() {
		initGUI();
	}
	
	private void initGUI() {
		
		setBackground(new Color(252, 243, 218));
		
		pumpkinPnl = new JPanel();
		pumpkinPnl.setLayout(new GridBagLayout());
		pumpkinPnl.setBackground(new Color(252, 243, 218));
		GridBagConstraints gbc;
		
		JLabel ingredientsLbl = new JLabel("INGREDIENTES");
		ingredientsLbl.setFont(new Font("Arial", Font.BOLD, 16));
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		pumpkinPnl.add(ingredientsLbl, gbc);
		
		String ingredients;
		ingredients = "* 750 gramos de auyama\n" +
				"* 2 cucharadas de leche en polvo\n" +
				"* 3 huevos enteros\n" +
				"* 1/2 de taza de azúcar (mas un 1/4 de taza para espolvorear por encima)\n" +
				"* 1/2 taza de mantequilla (100 gramos aprox.)\n" +
				"* 1 cucharadita de vainilla\n" +
				"* 1 cucharadita de canela\n" +
				"* 1/2 cucharadita de nuez moscada en polvo\n" +
				"* 1 pizca de clavos de olor en polvo\n" +
				"* 1/2 taza de harina leudante\n" +
				"* 1/2 cucharadita de polvo de hornear\n" +
				"* 1/3 de taza de pasitas\n";
		
		JTextArea ingredientsTxt = new JTextArea(ingredients);
		ingredientsTxt.setBackground(new Color(252, 243, 218));
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0; // Coordenada x en el grid
		gbc.gridy = 1; // Coordenada y en el grid
		gbc.gridwidth = 1; // Cantidad de celdas de ancho
		gbc.gridheight = 1; // Cantidad de celdas de alto
		gbc.weightx = 0; // Peso de la celda en horizontal
		gbc.weighty = 0; // Peso de la celda enla vertical
		gbc.anchor = GridBagConstraints.WEST; // Ancla relativa a la celda
		gbc.fill = GridBagConstraints.NONE; // Como usa el espacio disponible
		gbc.insets = new Insets(1, 1, 1, 1); // Espacios que reserva el
												// componente entre el borde del
												// objeto y la celda
		pumpkinPnl.add(ingredientsTxt, gbc);
		
		JLabel cakeImg = new JLabel();
		cakeImg.setIcon(new ImageIcon(getClass().getResource("images/slide1.png")));
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
		pumpkinPnl.add(cakeImg, gbc);
		
		JLabel procedureLbl = new JLabel("PROCEDIMIENTO");
		procedureLbl.setFont(new Font("Arial", Font.BOLD, 16));
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
		pumpkinPnl.add(procedureLbl, gbc);
		
		String procedure;
		procedure = "1. Se cocina  la auyuma cortada en trozos en agua o al vapor hasta que esté bien blanda. (Que no se deshaga)\n" +
				"2. Se deja enfriar un poco y se hace un puré.\n" +
				"3. Se bate la mantequilla con el azúcar. Luego se incorporan uno a uno los huevos. Se agrega la leche en polvo y se bate bien.\n" +
				"4. Se agrega las especias y la vainilla. Mezclar bien.\n" +
				"5. Se agrega la harina y el polvo de hornear. Mezclar sin batir demasiado.\n" +
				"6. Incorporar el puré de auyama, las pasitas enharinadas, y mezclar con una cuchara.\n" +
				"7. Se coloca en un molde enmantequillado y enharinado.\n" +
				"8. Rociarle por encima 1/4 de taza de azúcar.\n" +
				"9. Hornear a 180 C en horno precalentado aprox. 45 minutos hasta que tenga un ligero color dorado y al introducirle un palito salga seco.\n" +
				"Listo!, Se puede acompañar con queso blanco. ¡Buen provecho!";
		
		JTextArea procedureTxt = new JTextArea(procedure);
		procedureTxt.setBackground(new Color(252, 243, 218));
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 3; 
		gbc.gridwidth = 2; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.WEST; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1); 
		pumpkinPnl.add(procedureTxt, gbc);
		
		JButton btnBack = new JButton(new ImageIcon(getClass().getResource("/images/back.png")));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(new Color(252, 243, 218));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 0; 
		gbc.gridy = 4; 
		gbc.gridwidth = 2; 
		gbc.gridheight = 1;
		gbc.weightx = 0; 
		gbc.weighty = 0; 
		gbc.anchor = GridBagConstraints.CENTER; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.insets = new Insets(1, 1, 1, 1); 
		pumpkinPnl.add(btnBack, gbc);		
		
		JButton btnHelp = new JButton(new ImageIcon(getClass().getResource("/images/help.png")));
		btnHelp.setBorderPainted(false);
		btnHelp.setBackground(new Color(252, 243, 218));
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHelpClicked();
			}
		});
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 1, 1, 1);
		pumpkinPnl.add(btnHelp, gbc);
		
		add(pumpkinPnl);
		
		pumpkinAskPnl = new PumpkinAskPnl();
		pumpkinAskPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pumpkinAskPnlBackClicked();
			}
		});
		pumpkinAskPnl.setVisible(false);
		add(pumpkinAskPnl);
		
	}
	
	private void btnHelpClicked() {
		pumpkinAskPnl.setVisible(true);
		pumpkinPnl.setVisible(false);
		repaint();
	}

	public void pumpkinAskPnlBackClicked() {
		pumpkinAskPnl.setVisible(false);
		pumpkinPnl.setVisible(true);
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
