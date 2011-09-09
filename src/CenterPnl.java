import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.event.EventListenerList;

@SuppressWarnings("serial")
public class CenterPnl extends JPanel {

	public static final String BACK = "back";

	private MainPnl mainPnl;
	private BreadPnl breadPnl;
	private ThreeMilkPnl threeMilkPnl;
	private ChocolatePnl chocolatePnl;
	private HomeMadePnl homemadePnl;
	private PumpkinPnl pumpkinPnl;
	private PineapplePnl pineapplePnl;

	private EventListenerList eventListenerList = new EventListenerList();

	// De pan, tres leches, de chocolate, de ahuyama, casera, de piña
	public CenterPnl() {
		setBackground(new Color(252, 243, 218));

		mainPnl = new MainPnl();
		mainPnl.setVisible(true);
		mainPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPnlClicked(e);
			}
		});
		add(mainPnl);

		breadPnl = new BreadPnl();
		breadPnl.setVisible(false);
		breadPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked(e);
			}
		});
		add(breadPnl);

		threeMilkPnl = new ThreeMilkPnl();
		threeMilkPnl.setVisible(false);
		threeMilkPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked(e);
				
			}
		});
		add(threeMilkPnl);

		chocolatePnl = new ChocolatePnl();
		chocolatePnl.setVisible(false);
		chocolatePnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked(e);
				
			}
		});
		add(chocolatePnl);

		homemadePnl = new HomeMadePnl();
		homemadePnl.setVisible(false);
		homemadePnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked(e);
				
			}
		});
		add(homemadePnl);

		pumpkinPnl = new PumpkinPnl();
		pumpkinPnl.setVisible(false);
		pumpkinPnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked(e);
			}
		});
		add(pumpkinPnl);

		pineapplePnl = new PineapplePnl();
		pineapplePnl.setVisible(false);
		pineapplePnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBackClicked(e);
			}
		});
		add(pineapplePnl);

	}

	private void btnBackClicked(ActionEvent e) {
		if (e.getActionCommand() == BACK) {
			setMainPnl();
			fireActionEvent(new ActionEvent(this, 0, BACK));
		}
	}

	private void mainPnlClicked(ActionEvent evt) {
		if (evt.getActionCommand() == TopBarPnl.cakes.Bread.name()) {
			setBreadPnl();
			fireActionEvent(new ActionEvent(this, 0,
					TopBarPnl.cakes.Bread.name()));
		} else if (evt.getActionCommand() == TopBarPnl.cakes.ThreeMilk.name()) {
			setThreeMilkPnl();
			fireActionEvent(new ActionEvent(this, 0,
					TopBarPnl.cakes.ThreeMilk.name()));
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Chocolate.name()) {
			setChocolatePnl();
			fireActionEvent(new ActionEvent(this, 0,
					TopBarPnl.cakes.Chocolate.name()));
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Homemade.name()) {
			setHomemadePnl();
			fireActionEvent(new ActionEvent(this, 0,
					TopBarPnl.cakes.Homemade.name()));
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Pumpkin.name()) {
			setPumpkinPnl();
			fireActionEvent(new ActionEvent(this, 0,
					TopBarPnl.cakes.Pumpkin.name()));
		} else if (evt.getActionCommand() == TopBarPnl.cakes.Pineapple.name()) {
			setPineapplePnl();
			fireActionEvent(new ActionEvent(this, 0,
					TopBarPnl.cakes.Pineapple.name()));
		}
	}

	public void setMainPnl() {
		mainPnl.setVisible(true);
		breadPnl.setVisible(false);
		threeMilkPnl.setVisible(false);
		chocolatePnl.setVisible(false);
		homemadePnl.setVisible(false);
		pumpkinPnl.setVisible(false);
		pineapplePnl.setVisible(false);
		repaint();
	}

	private void setBreadPnl() {
		mainPnl.setVisible(false);
		breadPnl.setVisible(true);
		threeMilkPnl.setVisible(false);
		chocolatePnl.setVisible(false);
		homemadePnl.setVisible(false);
		pumpkinPnl.setVisible(false);
		pineapplePnl.setVisible(false);
		repaint();
	}

	private void setThreeMilkPnl() {
		mainPnl.setVisible(false);
		breadPnl.setVisible(false);
		threeMilkPnl.setVisible(true);
		chocolatePnl.setVisible(false);
		homemadePnl.setVisible(false);
		pumpkinPnl.setVisible(false);
		pineapplePnl.setVisible(false);
		repaint();
	}

	private void setChocolatePnl() {
		mainPnl.setVisible(false);
		breadPnl.setVisible(false);
		threeMilkPnl.setVisible(false);
		chocolatePnl.setVisible(true);
		homemadePnl.setVisible(false);
		pumpkinPnl.setVisible(false);
		pineapplePnl.setVisible(false);
		repaint();
	}

	private void setHomemadePnl() {
		mainPnl.setVisible(false);
		breadPnl.setVisible(false);
		threeMilkPnl.setVisible(false);
		chocolatePnl.setVisible(false);
		homemadePnl.setVisible(true);
		pumpkinPnl.setVisible(false);
		pineapplePnl.setVisible(false);
		repaint();
	}

	private void setPumpkinPnl() {
		mainPnl.setVisible(false);
		breadPnl.setVisible(false);
		threeMilkPnl.setVisible(false);
		chocolatePnl.setVisible(false);
		homemadePnl.setVisible(false);
		pumpkinPnl.setVisible(true);
		pineapplePnl.setVisible(false);
		repaint();
	}

	private void setPineapplePnl() {
		mainPnl.setVisible(false);
		breadPnl.setVisible(false);
		threeMilkPnl.setVisible(false);
		chocolatePnl.setVisible(false);
		homemadePnl.setVisible(false);
		pumpkinPnl.setVisible(false);
		pineapplePnl.setVisible(true);
		repaint();
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
