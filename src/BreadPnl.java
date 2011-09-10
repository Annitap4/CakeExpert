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

public class BreadPnl extends JPanel {

	private EventListenerList eventListenerList = new EventListenerList();
	private JPanel breadPnl;
	private BreadAskPnl breadAskPnl;


	public BreadPnl() {
		initGUI();
	}

	private void initGUI() {
		setBackground(new Color(252, 243, 218));
		
		breadPnl = new JPanel();
		breadPnl.setLayout(new GridBagLayout());
		breadPnl.setBackground(new Color(252, 243, 218));
		breadPnl.setVisible(true);
		GridBagConstraints gbc;

		String ingredients;
		ingredients = "INGREDIENTES:\n" + 
			"- ¼ Kg de pan\n" +
			"- 1 Taza de azúcar\n" +
			"- 3 Huevos batidos\n" +
			"- 2 Tazas de leche\n" +
			"- 1 Cajita de pasitas (opcional)\n" +
			"- 2 Cucharaditas de polvo de hornear\n" +
			"- 3 Cucharadas de mantequilla" +
			"- 1 Copita de ron o vino\n" +
			"- 3 Cucharadas de harina o maicena\n" +
			"- 1 Cucharadita de vainilla";

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
		breadPnl.add(ingredientsTxt, gbc);

		String procedure;
		procedure = "Preparación:\n" +
				"Remojar el pan en la leche durante una hora. Batirlo hasta dejarlo molido\n" +
				"(desmenuzado, se puede hacer con las manos). Agregar los huevos previamente batidos.\n" +
				"Añadir el azúcar y mezclar. Agregar poco a poco, la harina previamente cernida con el\n" +
				"polvo de hornear, unir todo. Agregar el licor, la vainilla y las pasas previamente\n" +
				"enharinadas (para que no se vayan al fondo). Engrasar y enharinar el molde. Hornear a\n" +
				"temperatura moderada hasta que dore (unos 200 grados C o 350 F). NOTA: El molde puede\n" +
				"ser previamente acaramelado con una taza de agua y dos tazas de azúcar que se cocinan\n" +
				"hasta que el caramelo este dorado." ;

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
		breadPnl.add(procedureTxt, gbc);

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
		breadPnl.add(btnBack, gbc);
		
		JButton btnHelp = new JButton("¿Que hacer si...?");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHelpClicked();
			}
		});
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
		breadPnl.add(btnHelp, gbc);
		add(breadPnl);
		
		breadAskPnl = new BreadAskPnl();
		breadAskPnl.setVisible(false);
		add(breadAskPnl);
		
	}

	private void btnHelpClicked() {
		breadPnl.setVisible(false);
		breadAskPnl.setVisible(true);
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
/*
 * TORTA DE PAN (Receta de Venezuela)
 * 
 * INGREDIENTES ¼ Kg de pan 1 Taza de azúcar 3 Huevos batidos 2 Tazas de leche 1
 * Cajita de pasitas (opcional, o se le puede agregar pedacitos de bocadillo de
 * guayaba) 2 Cucharaditas de polvo de hornear 3 Cucharadas de mantequilla 1
 * Copita de ron o vino 3 Cucharadas de harina o maicena 1 Cucharadita de
 * vainilla
 * 
 * PRCEDIMIENTO Remojar el pan en la leche durante una hora. Batirlo hasta
 * dejarlo molido (desmenuzado, se puede hacer con las manos). Agregar los
 * huevos previamente batidos. Añadir el azúcar y mezclar. Agregar poco a poco,
 * la harina previamente cernida con el polvo de hornea, unir todo. Agregar el
 * licor, la vainilla y las pasas previamente enharinadas (para que no se vayan
 * al fondo). Engrasar y enharinar el molde. Hornear a temperatura moderada
 * hasta que dore (unos 200 grados C o 350 F). NOTA: El molde puede ser
 * previamente acaramelado con una taza de agua y dos tazas de azúcar que se
 * cocinan hasta que el caramelo este dorado. O se puede enmantequillar y en vez
 * de harina rociarle azucar (queda muy bueno asi) NOTA: Se puede suplir la
 * leche y el azúcar, remojando el pan en agua o leche y se agrega medio pote de
 * leche condensada (1 pote para cada 6 huevos).
 */
