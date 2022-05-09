package driver;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mvc.ScreenCastController;
import mvc.ScreenCastModel;
import mvc.ScreenCastView;

public class ScreenCast extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3169702616284650978L;
	private JPanel contentPane;
	private JButton screenOne;
	private JButton screenTwo;
	private JButton screenFour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ScreenCastModel model = new ScreenCastModel();
		ScreenCastView view = new ScreenCastView();
		ScreenCastController controller = new ScreenCastController(model, view);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenCast frame = new ScreenCast();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScreenCast() {
		initComponents();
		handleComponents();
	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 1007, 376);
		contentPane.add(panel);
		
		screenTwo = new JButton("Screen 2");
		screenTwo.setBounds(267, 394, 126, 38);
		contentPane.add(screenTwo);
		
		screenOne = new JButton("Screen 1");
		screenOne.setBounds(25, 394, 126, 38);
		contentPane.add(screenOne);
		
		JButton screenThree = new JButton("Screen 3");
		screenThree.setBounds(470, 394, 126, 38);
		contentPane.add(screenThree);
		
		screenFour = new JButton("Screen 4");
		screenFour.setBounds(674, 395, 126, 38);
		contentPane.add(screenFour);
	}
	
	public void handleComponents() {
		
	}
}
