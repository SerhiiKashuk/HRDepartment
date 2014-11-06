package GUIViewer;

import java.awt.event.ActionEvent;

public class ChangeValues extends JFrame {

	private static final long serialVersionUID = 54356785676L;
	private JPanel contentPane;
	private JTextField insertValue;

	public ChangeValues() {
		setTitle("Reconfigure");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 350, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		insertValue = new JTextField();
		insertValue.setBounds(71, 45, 176, 20);
		contentPane.add(insertValue);
		insertValue.setColumns(10);

		JButton okKey = new JButton("OK");
		okKey.setBounds(132, 113, 53, 23);
		contentPane.add(okKey);
		okKey.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String res = insertValue.getText();
				HR.setInsertVal(res);
				setVisible(false);

			}
		});

	}

}
