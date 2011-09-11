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

import com.sun.org.apache.bcel.internal.generic.L2D;

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
		breadPnl.add(ingredientsLbl, gbc);
		

		String ingredients;
		ingredients = "* ¼ Kg de pan\n" +
			"* 1 Taza de azúcar\n" +
			"* 3 Huevos batidos\n" +
			"* 2 Tazas de leche\n" +
			"* 1 Cajita de pasitas (opcional)\n" +
			"* 2 Cucharaditas de polvo de hornear\n" +
			"* 3 Cucharadas de mantequilla\n" +
			"* 1 Copita de ron o vino\n" +
			"* 3 Cucharadas de harina o maicena\n" +
			"* 1 Cucharadita de vainilla";

		JTextArea ingredientsTxt = new JTextArea(ingredients);
		ingredientsTxt.setBackground(new Color(252, 243, 218));
		
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
		breadPnl.add(ingredientsTxt, gbc);
		
		JLabel cakeImg = new JLabel();
		cakeImg.setIcon(new ImageIcon(getClass().getResource("images/slide.png")));
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
		breadPnl.add(cakeImg, gbc);
		
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
		breadPnl.add(procedureLbl, gbc);

		String procedure;
		procedure = "Remojar el pan en la leche durante una hora. Batirlo hasta dejarlo molido (desmenuzado,\n" +
				"se puede hacer con las manos). Agregar los huevos previamente batidos. Añadir el azúcar\n" +
				"y mezclar. Agregar poco a poco, la harina previamente  cernida con el polvo  de hornear,\n" +
				"unir todo. Agregar el licor, la vainilla y las pasas previamente enharinadas (para que no se\n" +
				"vayan al fondo). Engrasar y enharinar el molde. Hornear a temperatura moderada hasta que\n" +
				"dore (unos 200 grados C o 350 F). NOTA: El molde puede ser previamente acaramelado con\n" +
				"una taza de agua y dos tazas de azúcar que se cocinan hasta que el caramelo este dorado.\n";

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
		breadPnl.add(procedureTxt, gbc);

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
		breadPnl.add(btnBack, gbc);
		
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
		breadPnl.add(btnHelp, gbc);
		add(breadPnl);
		
		breadAskPnl = new BreadAskPnl();
		breadAskPnl.setVisible(false);
		breadAskPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				breadAskPnlBackClicked();
			}
		});
		add(breadAskPnl);
		
	}

	public void breadAskPnlBackClicked() {
		breadAskPnl.setVisible(false);
		breadPnl.setVisible(true);
		repaint();
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
