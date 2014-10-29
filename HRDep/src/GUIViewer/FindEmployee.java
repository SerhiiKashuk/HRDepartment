package GUIViewer;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import resourse.Function;
import resourse.HR;

public class FindEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField idEmployee;
	private JButton res;

	public FindEmployee() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel id = new JLabel("ID");
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setBounds(63, 33, 46, 44);
		contentPane.add(id);
		
		idEmployee = new JTextField();
		idEmployee.setBounds(132, 45, 86, 20);
		contentPane.add(idEmployee);
		idEmployee.setColumns(10);
		
		final JEditorPane result = new JEditorPane();
		result.setBounds(82, 136, 212, 83);
		contentPane.add(result);
		
		res = new JButton("Result");
		res.setBounds(129, 92, 89, 23);
		contentPane.add(res);
		res.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HR human = HR.getHR();
				try {
					
					String record = Function.getRecordById
					           (human.getStorage(), Integer.valueOf(idEmployee.getText()));
					result.setText(record);
				} catch (NumberFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
