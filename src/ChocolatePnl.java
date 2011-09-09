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


public class ChocolatePnl extends JPanel {
	
	private EventListenerList eventListenerList = new EventListenerList();

	public ChocolatePnl() {
		initGUI();
	}

	private void initGUI() {

		setLayout(new GridBagLayout());
		setBackground(new Color(252, 243, 218));
		GridBagConstraints gbc;

		String ingredients;
		ingredients = "INGREDIENTES:\n" +
				"Torta:\n" +
				"- 5 Tazas de harina (Todo uso)\n" +
				"- 2 ¾ Tazas de azúcar\n" +
				"- 6 Huevos\n" +
				"- 3 ½ Barras de mantequilla (400 gr.)\n" +
				"- 5 Cucharaditas de polvo Leudante\n" +
				"- 1 Tableta (8 Barras) de chocolate de taza\n" +
				"- ¾ Tazas de leche\n" +
				"Cubierta:\n" +
				"- 1 Lata de leche condensada\n" +
				"- 1 Tableta (8 Barras) de chocolate de taza" +
				"- 2 Cucharadas de Mantequilla\n" +
				"- ½ Taza de leche\n";

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
				" Torta:\n" +
				"Se bate la mantequilla con el azúcar y se le van agregando los huevos (uno por uno); se cierne la harina\n" +
				"con el polvo leudante y se le agrega a la anterior mezcla hasta que se mezcle bien. Aparte se derrite el \n" +
				"chocolate en la leche a fuego muy lento moviendo constantemente, se reposa y cuando esté frío se mezcla con\n" +
				"los demás ingredientes. Vierta la preparación en un molde debidamente engrasado y enharinado y llévela al horno a 350° F\n" +
				" Cubierta:\n" +
				"Se monta a fuego muy lento la leche, el chocolate y la leche condensada y cuando está todo completamente disuelto\n" +
				"se agrega la mantequilla, se baja del fuego y se deja reposar; aún caliente se cubre bien la torta y se adorna con confites,\n" +
				"frutilla, guindas o nueces molidas." ;

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
