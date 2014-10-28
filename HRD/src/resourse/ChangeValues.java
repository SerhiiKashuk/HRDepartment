package resourse;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ChangeValues extends JFrame {

	private JPanel contentPane;
	private JTextField insertValue;
	private static String res;
	

	

	public ChangeValues() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 350, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		insertValue = new JTextField();
		insertValue.setBounds(74, 72, 176, 20);
		contentPane.add(insertValue);
		insertValue.setColumns(10);
		
		JButton okKey = new JButton("OK");
		okKey.setBounds(132, 113, 53, 23);
		contentPane.add(okKey);
		okKey.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String res = insertValue.getText();
				HR.setInsertVal(res);
				setVisible(false);
				
			}
		});
	     
	}




}
