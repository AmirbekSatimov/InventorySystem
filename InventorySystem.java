package login_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.border.MatteBorder;
import java.awt.FlowLayout;

public class InventorySystem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventorySystem window = new InventorySystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InventorySystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		
		JPanel Title = new JPanel();
		FlowLayout flowLayout = (FlowLayout) Title.getLayout();
		flowLayout.setVgap(50);
		Title.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Title.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(Title, BorderLayout.NORTH);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
