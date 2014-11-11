package GUIViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import resourse.DBConnection;

import java.awt.Color;


public class HRDepartment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField salary;
	private JTextField name;
	private JTextField surname;
	private JTextField address;
	private JTextField phone;
	private PreparedStatement insert = null;
	private Connection connection = null;

	public HRDepartment() {
		setFont(null);
		setType(Type.POPUP);
		setBackground(new Color(0, 255, 255));
		setForeground(new Color(255, 255, 255));
		setTitle("HRDepartment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 364);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		name = new JTextField();
		name.setBounds(214, 25, 157, 20);
		contentPane.add(name);
		name.setColumns(10);

		surname = new JTextField();
		surname.setBounds(214, 56, 157, 20);
		contentPane.add(surname);
		surname.setColumns(10);

		salary = new JTextField();
		salary.setBounds(214, 149, 157, 20);
		contentPane.add(salary);
		salary.setColumns(10);

		JButton adding = new JButton("Add");
		adding.setBounds(20, 216, 89, 23);
		contentPane.add(adding);

		adding.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				connection = DBConnection.getConnection();

				try {
					insert = connection.prepareStatement("INSERT INTO Worker (name, surname, phone, address, salary)"
							+ " VALUES (?,?,?,?,?)");
					insert.setString(1, name.getText());
					insert.setString(2, surname.getText());
					insert.setString(3, phone.getText());
					insert.setString(4, address.getText());
					insert.setString(5, salary.getText());

					insert.executeUpdate();
				} catch (SQLException e) {

					e.printStackTrace();
				} finally {
					// позакрываем теперь все
					if (insert != null) {
						try {
							insert.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if (connection != null) {
						try {
							connection.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("Insert values in DB is succesful");
			}
		});

		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(20, 28, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("SURNAME");
		lblNewLabel_1.setBounds(20, 59, 67, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("SALARY");
		lblNewLabel_2.setBounds(20, 152, 46, 14);
		contentPane.add(lblNewLabel_2);

		JButton updat = new JButton("UPDATE");
		updat.setBounds(151, 216, 89, 23);
		contentPane.add(updat);

		JButton finding = new JButton("FIND BY ID");
		finding.setBounds(274, 216, 113, 23);
		contentPane.add(finding);

		address = new JTextField();
		address.setBounds(214, 118, 157, 20);
		contentPane.add(address);
		address.setColumns(10);

		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setBounds(20, 90, 46, 14);
		contentPane.add(lblPhone);

		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(20, 121, 67, 14);
		contentPane.add(lblAddress);

		phone = new JTextField();
		phone.setBounds(214, 87, 157, 20);
		contentPane.add(phone);
		phone.setColumns(10);

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
