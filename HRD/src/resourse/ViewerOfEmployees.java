package resourse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ViewerOfEmployees extends JFrame {

	private JPanel contentPane;
	 JTextPane viewer;


	public ViewerOfEmployees() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 viewer = new JTextPane();
		viewer.setBounds(35, 11, 347, 240);
		contentPane.add(viewer);
	}
}
