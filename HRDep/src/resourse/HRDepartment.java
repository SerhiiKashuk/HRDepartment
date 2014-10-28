package resourse;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;

public class HRDepartment extends JFrame {

	private JPanel contentPane;
	private JPanel condition;
	private JTextField year;
	private JTextField idToFind;
	private JTextField name;
	private JTextField surname;
	private boolean start = true;
	private HR human;


	public HRDepartment() {
		setTitle("HRDepartment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(118, 25, 86, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		surname = new JTextField();
		surname.setBounds(118, 56, 86, 20);
		contentPane.add(surname);
		surname.setColumns(10);
		
		year = new JTextField();
		year.setBounds(118, 87, 86, 20);
		contentPane.add(year);
		year.setColumns(10);
		
		JButton adding = new JButton("Add");
		adding.setBounds(30, 244, 89, 23);
		contentPane.add(adding);
		
		
		
		adding.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				if(start){
					  human = HR.getHR();
					String res = name.getText();
				
					Employee staffer = new Employee(name.getText(), surname.getText(),
							
							Integer.valueOf(year.getText()));
					human.saveEmployee(staffer);
					
				}
			}
		});
		
		idToFind = new JTextField();
		idToFind.setBounds(298, 87, 86, 20);
		contentPane.add(idToFind);
		idToFind.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(20, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SURNAME");
		lblNewLabel_1.setBounds(20, 59, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("YEAR");
		lblNewLabel_2.setBounds(20, 90, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton updat = new JButton("UPDATE");
		updat.setBounds(176, 244, 89, 23);
		contentPane.add(updat);
		
		JButton finding = new JButton("Find By ID");
		finding.setBounds(246, 35, 89, 23);
		contentPane.add(finding);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(227, 90, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		finding.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Employee st = HR.getEmployeeByid(Integer.valueOf(idToFind.getText()));
					ViewerOfEmployees frame = new ViewerOfEmployees();
					frame.setVisible(true);
					frame.viewer.setText( st.getName() + st.getSurName() + st.getYear());
				} catch (NumberFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		updat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
					Updating frame1 = new Updating();
					frame1.setVisible(true);
				

				
			}
		});
	}
}
