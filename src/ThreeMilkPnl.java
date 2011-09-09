import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.EventListenerList;

public class ThreeMilkPnl extends JPanel {

	private EventListenerList eventListenerList = new EventListenerList();

	public ThreeMilkPnl() {
		initGUI();
	}

	private void initGUI() {

		setLayout(new GridBagLayout());
		setBackground(new Color(252, 243, 218));
		GridBagConstraints gbc;

		String ingredients;
		ingredients = "INGREDIENTES:\n" + "Para el biscocho:\n"
				+ "- 6 huevos\n" + "- 200 grs. de Azúcar\n"
				+ "- 200 grs. de Harina\n" + "- 1 cdta. de Vainilla\n"
				+ "- 1 cdta. de polvos de hornear\n" + "- Para la crema:\n"
				+ "- 1 pote de Leche condensada (grande)\n"
				+ "- 1 pote de leche evaporada (grande)\n"
				+ "- 1 pote de crema de leche (grande)\n"
				+ "- Para el merengue:\n" + "- 3 claras de huevo\n"
				+ "- Azúcar (la que usted crea necesaria)\n";

		JTextArea ingredientsTxt = new JTextArea(ingredients);
		ingredientsTxt.setBackground(new Color(252, 243, 218));

		gbc = new GridBagConstraints();
		gbc.gridx = 0; // Coordenada x en el grid
		gbc.gridy = 0; // Coordenada y en el grid
		gbc.gridwidth = 1; // Cantidad de celdas de ancho
		gbc.gridheight = 1; // Cantidad de celdas de alto
		gbc.weightx = 0; // Peso de la celda en horizontal
		gbc.weighty = 0; // Peso de la celda enla vertical
		gbc.anchor = GridBagConstraints.WEST; // Ancla relativa a la celda
		gbc.fill = GridBagConstraints.NONE; // Como usa el espacio disponible
		gbc.insets = new Insets(1, 1, 1, 1); // Espacios que reserva el
												// componente entre el borde del
												// objeto y la celda
		add(ingredientsTxt, gbc);

		String procedure;
		procedure = "Preparación:\n" +
				"1. Batir las tres leches en la licuadora y reservar" +
				"2. Batir muy bien los huevos hasta cremar, agregar el azúcar poco a poco y de último la harina:\n    tamizada con el polvo de hornear.\n" +
				"3. Colocar la mezcla en un molde enmantequillado en el horno a 180 grados C hasta que dore (15 min aprox)\n" +
				"4. Sacar del horno y dejar enfriar\n" +
				"5. Puyar todo el biscocho por encima con un tenedor\n" +
				"6. Mojar el biscocho con las tres leches que se tenían reservadas, el biscocho deberá absorber:\n    toda la leche por los agujeros hechos.\n" +
				"7. Batir las claras de huevo con el azucar hasta llegar a punto de nieve para hacer el merengue:\n" +
				"8. De último con el merengue cubrir la torta y se pueden hacer decoraciones con la manga." ;

		JTextArea procedureTxt = new JTextArea(procedure);
		procedureTxt.setBackground(new Color(252, 243, 218));

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
		add(procedureTxt, gbc);

		JButton btnBack = new JButton("Volver");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked();
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
		add(btnBack, gbc);
		
		JButton btnHelp = new JButton("¿Que hacer si...?");
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
		add(btnHelp, gbc);
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
