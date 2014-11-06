package GUIViewer;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;


import resourse.Employee;
import resourse.HR;
import java.awt.Color;

public class HRDepartment extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField year;
	private JTextField name;
	private JTextField surname;
	private boolean start = true;
	private HR human;

	public HRDepartment() {
		setBackground(Color.BLUE);
		setForeground(new Color(255, 255, 255));
		setTitle("HRDepartment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		name = new JTextField();
		name.setBounds(285, 25, 86, 20);
		contentPane.add(name);
		name.setColumns(10);

		surname = new JTextField();
		surname.setBounds(285, 56, 86, 20);
		contentPane.add(surname);
		surname.setColumns(10);

		year = new JTextField();
		year.setBounds(285, 87, 86, 20);
		contentPane.add(year);
		year.setColumns(10);

		JButton adding = new JButton("Add");
		adding.setBounds(20, 166, 89, 23);
		contentPane.add(adding);

		adding.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub

				human = HR.getHR();
				String res = name.getText();

				Employee staffer = new Employee(name.getText(), surname.getText(),

				Integer.valueOf(year.getText()));
				human.saveEmployee(staffer);

			}
		});

		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(20, 28, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("SURNAME");
		lblNewLabel_1.setBounds(20, 59, 67, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("SALARY");
		lblNewLabel_2.setBounds(20, 90, 46, 14);
		contentPane.add(lblNewLabel_2);

		JButton updat = new JButton("UPDATE");
		updat.setBounds(158, 166, 89, 23);
		contentPane.add(updat);

		JButton finding = new JButton("FIND BY ID");
		finding.setBounds(282, 166, 89, 23);
		contentPane.add(finding);

		finding.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindEmployee frame = new FindEmployee();
				frame.setVisible(true);

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
