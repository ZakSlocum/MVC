package driver;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.beryx.awt.color.ColorFactory;

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
	private ScreenCastModel model = new ScreenCastModel();
	private ScreenCastView view = new ScreenCastView();
	private ScreenCastController controller = new ScreenCastController(model, view);
	private JPanel panel;
	private JButton screenThree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

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
		
		panel = new JPanel();
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
		
		screenThree = new JButton("Screen 3");
		screenThree.setBounds(470, 394, 126, 38);
		contentPane.add(screenThree);
		
		screenFour = new JButton("Screen 4");
		screenFour.setBounds(674, 395, 126, 38);
		contentPane.add(screenFour);
	}
	
	public void handleComponents() {
		screenOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.SetScreen("RED");
				Color color = ColorFactory.valueOf(controller.updateView());
				panel.setBackground(color);
			}
		});
		screenTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.SetScreen("ORANGE");
				Color color = ColorFactory.valueOf(controller.updateView());
				panel.setBackground(color);
			}
		});
		screenThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.SetScreen("GREEN");
				Color color = ColorFactory.valueOf(controller.updateView());
				panel.setBackground(color);
			}
		});
		screenFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.SetScreen("CYAN");
				Color color = ColorFactory.valueOf(controller.updateView());
				panel.setBackground(color);
			}
		});
	}
}
