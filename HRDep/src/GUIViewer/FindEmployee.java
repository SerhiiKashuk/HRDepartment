package GUIViewer;

import java.awt.event.ActionEvent;

public class FindEmployee extends JFrame {

	private static final long serialVersionUID = 23456789;
	private JPanel contentPane;
	private JTextField idEmployee;
	private JButton res;

	public FindEmployee() {
		setTitle("Search Result");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 390, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel id = new JLabel("ID");
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setBounds(63, 33, 46, 44);
		contentPane.add(id);

		idEmployee = new JTextField();
		idEmployee.setBounds(129, 45, 89, 20);
		contentPane.add(idEmployee);
		idEmployee.setColumns(10);

		final JEditorPane result = new JEditorPane();
		result.setBounds(10, 136, 354, 60);
		contentPane.add(result);

		res = new JButton("Result");
		res.setBounds(129, 90, 89, 23);
		contentPane.add(res);
		res.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				HR human = HR.getHR();
				try {

					String record = Function.getRecordById(human.getStorage(), Integer.valueOf(idEmployee.getText()));
					result.setText(record);
				} catch (NumberFormatException | IOException e1) {

					e1.printStackTrace();
				}
			}
		});
	}
}
