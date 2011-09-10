import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import sun.awt.RepaintArea;

public class MainFrm extends JFrame {

	public TopBarPnl topBar;
	public CenterPnl center;
	public BottomPnl bottom;

	public MainFrm() {
		setLayout(new BorderLayout(3, 1));
		setTitle("Cake Expert");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(true);
		setVisible(true);
		
		menus();
		
		topBar = new TopBarPnl();
		topBar.setPreferredSize(new Dimension(80, 100));
		topBar.setVisible(true);
		add(topBar, BorderLayout.NORTH);
		
		center = new CenterPnl();
		center.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlCenterClicked(e);
			}
		});
		add(center, BorderLayout.CENTER);
		
		bottom = new BottomPnl();
		add(bottom, BorderLayout.SOUTH);
		setIconImage(new ImageIcon(getClass().getResource("/images/cake.png"))
				.getImage());

	}

	private void pnlCenterClicked(ActionEvent evt) {
		if (evt.getActionCommand() == CenterPnl.BACK) {
			topBar.setWelcome();
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Bread.name()) {
			topBar.setBreadCake();
		} else if (evt.getActionCommand() == TopBarPnl.cakes.ThreeMilk.name()) {
			topBar.setThreeMilkCake();
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Chocolate.name()) {
			topBar.setChocolateCake();
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Homemade.name()) {
			topBar.setHomemadeCake();
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Pumpkin.name()) {
			topBar.setPumpkinCake();
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Pineapple.name()) {
			topBar.setPineappleCake();
		}
	}

	private void menus() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu options = new JMenu("Opciones");
		JMenuItem init = new JMenuItem("Iniciar");
		init.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topBar.setWelcome();
				center.setMainPnl();
			}
		});
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,
				ActionEvent.CTRL_MASK));
		init.setMnemonic(KeyEvent.VK_I);
		options.add(init);
		JMenuItem exit = new JMenuItem("Salir");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
				ActionEvent.CTRL_MASK));
		exit.setMnemonic(KeyEvent.VK_Q);
		options.add(exit);
		menuBar.add(options);

		JMenu help = new JMenu("Ayuda");
		JMenuItem aboutUs = new JMenuItem("Äcerca de   ");
		aboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								MainFrm.this,
								"Cake Expert v1.1\n\n\nSistema Experto en la preparacion de Tortas\n\nDesarrollado por GSD\n\tAnna Lezama\n\tAlejandro Mujica\n\tMiguel Flores\n\nInteligencia Artificial\nEscuela de Ingenieria de Sistemas\nUniversidad de los Andes\n\n",
								"Acerca de", JOptionPane.PLAIN_MESSAGE);
			}
		});
		help.add(aboutUs);
		menuBar.add(help);
	}

	public static void main(String[] args) {
		new MainFrm();
	}

}
