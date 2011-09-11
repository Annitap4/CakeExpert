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


public class PineapplePnl extends JPanel {
	private EventListenerList eventListenerList = new EventListenerList();
	private JPanel pineapplePnl;
	private PineappleAskPnl pineappleAskPnl;

	public PineapplePnl() {
		initGUI();
	}

	private void initGUI() {

		setBackground(new Color(252, 243, 218));
		
		pineapplePnl = new JPanel();
		pineapplePnl.setLayout(new GridBagLayout());
		pineapplePnl.setBackground(new Color(252, 243, 218));
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
		pineapplePnl.add(ingredientsLbl, gbc);

		String ingredients;
		ingredients = "* 4 tazas de harina cernida\n" +
				"* 2 ½ tazas de azúcar\n" +
				"* 4 panelitas de mantequilla\n" +
				"* 12 huevos\n" +
				"* ½ taza de leche\n" +
				"* 1 lata de ruedas de piña en almíbar\n" +
				"* 1/2 taza de guindas\n" +
				"* 1 cda de polvo de hornear\n" +
				"Caramelo\n" +
				"* 1 Taza de Azúcar\n" +
				"* 1/2 taza de agua";

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
		pineapplePnl.add(ingredientsTxt, gbc);
		
		JLabel cakeImg = new JLabel();
		cakeImg.setIcon(new ImageIcon(getClass().getResource("images/slide13.png")));
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
		pineapplePnl.add(cakeImg, gbc);
		
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
		pineapplePnl.add(procedureLbl, gbc);


		String procedure;
		procedure = "Batir la mantequilla con el azúcar hasta que esté bien cremosa, agregar las amarillas de huevo y continuar batiendo.\n" +
				"Se agrega la leche y el almíbar alternando con el harina y el polvo royal. Batir las claras de huevo a punto de nieve y\n" +
				"agregarle en forma envolvente la mezcla. Aparte preparar un caramelo hirviendo el azúcar y el agua, hasta obtener un\n" +
				"color ligeramente dorado. Colocar en un molde redondo donde se distribuyen de forma decorativa las piñas con las guindas\n" +
				"en el centro, se vierte la mezcla sobre el caramelo con las piñas y se lleva al horno por espacio de 40 minutos a 350º\n" +
				"hasta que al hundir un palillo salga completamente limpio. Voltee el molde mientras la torta aún este tibia." ;

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
		pineapplePnl.add(procedureTxt, gbc);

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
		pineapplePnl.add(btnBack, gbc);
		
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
		pineapplePnl.add(btnHelp, gbc);
		
		add(pineapplePnl);
		
		pineappleAskPnl = new PineappleAskPnl();
		pineappleAskPnl.setVisible(false);
		pineappleAskPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pineappleAskPnlBackClicked();
			}
		});
		add(pineappleAskPnl);
	}

	public void pineappleAskPnlBackClicked() {
		pineapplePnl.setVisible(true);
		pineappleAskPnl.setVisible(false);
		repaint();
	}

	private void btnHelpClicked() {
		pineapplePnl.setVisible(false);
		pineappleAskPnl.setVisible(true);
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
