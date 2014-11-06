package GUIViewer;

import java.awt.event.ActionEvent;

public class Updating extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ID;
	private JTextField position;
	private JButton okKey;
	private HR human;
	private ChangeValues frame2;

	public Updating() {
		setTitle("Update");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 302, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(15, 15, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ID = new JTextField();
		ID.setBounds(141, 25, 86, 20);
		contentPane.add(ID);
		ID.setColumns(10);

		position = new JTextField();
		position.setBounds(141, 77, 86, 20);
		contentPane.add(position);
		position.setColumns(10);

		JButton change = new JButton("CHANGE");
		change.setBounds(97, 156, 89, 23);
		contentPane.add(change);
		change.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame2 = new ChangeValues();
				frame2.setVisible(true);

			}
		});

		okKey = new JButton("OK");
		okKey.setBounds(107, 199, 67, 23);
		contentPane.add(okKey);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(42, 28, 46, 14);
		contentPane.add(lblId);

		JLabel lblPosition = new JLabel("Position");
		lblPosition.setBounds(42, 80, 46, 14);
		contentPane.add(lblPosition);
		okKey.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				human = HR.getHR();
				try {
					human.updateData(Integer.valueOf(ID.getText()), Integer.valueOf(position.getText()));
				} catch (NumberFormatException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
			}

		});
	}
}
