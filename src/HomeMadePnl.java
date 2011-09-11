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


public class HomeMadePnl extends JPanel {
	private EventListenerList eventListenerList = new EventListenerList();
	private JPanel homemadePnl;
	private HomemadeAskPnl homemadeAskPnl;

	public HomeMadePnl() {
		initGUI();
	}

	private void initGUI() {

		setBackground(new Color(252, 243, 218));
		
		homemadePnl = new JPanel();
		homemadePnl.setLayout(new GridBagLayout());
		homemadePnl.setBackground(new Color(252, 243, 218));
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
		homemadePnl.add(ingredientsLbl, gbc);

		String ingredients;
		ingredients = "* 2 tazas de azúcar\n" +
				"* 250 gramos de margarina sin sal\n" +
				"* 6 huevos\n" +
				"* 1 cucharada de esencia de vainilla o cualquier sabor de su preferencia\n" +
				"* 3 tazas de harina de trigo leudante\n" +
				"* 1 vaso de leche\n";

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
		homemadePnl.add(ingredientsTxt, gbc);
		
		JLabel cakeImg = new JLabel();
		cakeImg.setIcon(new ImageIcon(getClass().getResource("images/slide10.png")));
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
		homemadePnl.add(cakeImg, gbc);
		
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
		homemadePnl.add(procedureLbl, gbc);


		String procedure;
		procedure = "1. Bata la margarina hasta que se vea cremosa.\n" +
				"2. Agregue poco a poco el azúcar.\n" +
				"3. Luego se le añaden los huevos, de uno en uno.\n" +
				"4. Coloque la esencia que eligió, a su gusto.\n" +
				"5. Ahora agregue las 3 tazas de harina de trigo, y menee con una paleta, en forma envolvente\n" +
				"6. Agregue el vaso de leche y termine de batir\n" +
				"7. Enmanteque y enharine su envase, para proceder a colocar la mezcla.\n" +
				"8. Lleve al horno por un tiempo de 45 minutos, a una temperatura de 350ºC. Dejar enfriar y reservar." ;

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
		homemadePnl.add(procedureTxt, gbc);

		JButton btnBack = new JButton("Volver");
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
		homemadePnl.add(btnBack, gbc);
		
		JButton btnHelp = new JButton("¿Que hacer si...?");
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
		homemadePnl.add(btnHelp, gbc);
		
		add(homemadePnl);
		
		homemadeAskPnl = new HomemadeAskPnl();
		homemadeAskPnl.setVisible(false);
		homemadeAskPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homemadeAskPnlBackClicked();
			}
		});
		add(homemadeAskPnl);
	}

	public void homemadeAskPnlBackClicked() {
		homemadePnl.setVisible(true);
		homemadeAskPnl.setVisible(false);
		repaint();
	}

	private void btnHelpClicked() {
		homemadePnl.setVisible(false);
		homemadeAskPnl.setVisible(true);
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
