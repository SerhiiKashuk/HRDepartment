package GUIViewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Toolkit;

import javax.swing.DebugGraphics;

import java.awt.CardLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.Box;
import java.awt.SystemColor;

public class CardStaff extends JFrame {

	private JPanel contentPane;
	private boolean flag = false;
	private  JPanel panelPass; 
	private  JPanel panelWork;
	private  JPanel panelCard;
	private JPanel panelEduc;
	private JTextField ID;
	private JTextField surname;
	private JTextField name;
	private JTextField fatherName;
	private JTextField post;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public CardStaff() {
		setTitle("ВІДДІЛ КАДРІВ");
		setResizable(false);
		
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setVisible(true);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    panelCard = new JPanel();
		panelCard.setBounds(0, 23, 1000, 600);
		panelCard.setBackground(SystemColor.inactiveCaptionBorder);
		panelCard.setVisible(flag);
		contentPane.add(panelCard);
		panelCard.setLayout(null);
		
		ID = new JTextField();
		ID.setBounds(266, 21, 86, 20);
		panelCard.add(ID);
		ID.setColumns(10);
		
		surname = new JTextField();
		surname.setBounds(266, 58, 351, 20);
		panelCard.add(surname);
		surname.setColumns(10);
		
		name = new JTextField();
		name.setBounds(266, 99, 351, 20);
		panelCard.add(name);
		name.setColumns(10);
		
		fatherName = new JTextField();
		fatherName.setBounds(267, 145, 350, 20);
		panelCard.add(fatherName);
		fatherName.setColumns(10);
		
		post = new JTextField();
		post.setBounds(266, 186, 350, 20);
		panelCard.add(post);
		post.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(266, 237, 550, 20);
		panelCard.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(288, 486, 243, 20);
		panelCard.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(288, 539, 243, 20);
		panelCard.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(369, 296, 126, 20);
		panelCard.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(655, 296, 310, 20);
		panelCard.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(288, 346, 243, 20);
		panelCard.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(626, 21, 86, 20);
		panelCard.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(288, 438, 243, 20);
		panelCard.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(143, 296, 126, 20);
		panelCard.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(288, 394, 243, 20);
		panelCard.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel idLabel = new JLabel("Таб. Номер");
		idLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		idLabel.setBounds(50, 24, 146, 14);
		panelCard.add(idLabel);
		
		JLabel surnameLabel = new JLabel("Призвіще");
		surnameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		surnameLabel.setBounds(50, 61, 69, 14);
		panelCard.add(surnameLabel);
		
		JLabel nameLabel = new JLabel("Ім'я");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		nameLabel.setBounds(50, 102, 46, 14);
		panelCard.add(nameLabel);
		
		JLabel fatherNameLabel = new JLabel("Побатькові");
		fatherNameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		fatherNameLabel.setBounds(50, 148, 109, 14);
		panelCard.add(fatherNameLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Посада");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_4.setBounds(50, 189, 46, 14);
		panelCard.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Структурний підрозділ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_5.setBounds(50, 240, 167, 14);
		panelCard.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Телефон моб.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_6.setBounds(277, 299, 109, 14);
		panelCard.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Телефон дом.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_7.setBounds(50, 299, 109, 14);
		panelCard.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ІНН");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_8.setBounds(50, 397, 46, 14);
		panelCard.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Дата приняття на роботу");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_9.setBounds(408, 24, 208, 14);
		panelCard.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Громадянство");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_10.setBounds(50, 492, 126, 14);
		panelCard.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Домашня адреса");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_11.setBounds(50, 349, 146, 14);
		panelCard.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("E-mail");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_12.setBounds(565, 299, 46, 14);
		panelCard.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Дата народження");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_13.setBounds(50, 444, 126, 14);
		panelCard.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Сімейне положення");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_14.setBounds(50, 542, 167, 14);
		panelCard.add(lblNewLabel_14);
		
		JRadioButton manNewRadioButton = new JRadioButton("Чол.");
		manNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		manNewRadioButton.setBounds(678, 185, 63, 23);
		panelCard.add(manNewRadioButton);
		
		JRadioButton womanRadioButton = new JRadioButton("Жін.");
		womanRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		womanRadioButton.setBounds(743, 184, 55, 23);
		panelCard.add(womanRadioButton);
		
		JLabel sex = new JLabel("Стать");
		sex.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		sex.setBounds(685, 164, 234, 14);
		panelCard.add(sex);
		
		JPanel panelDismiss = new JPanel();
		panelDismiss.setBackground(SystemColor.window);
		panelDismiss.setBounds(614, 346, 386, 254);
		panelDismiss.setVisible(true);
		panelCard.add(panelDismiss);
		panelDismiss.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 53, 355, 20);
		panelDismiss.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Причина звільнення");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(80, 28, 213, 14);
		panelDismiss.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Дата звільнення");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(44, 104, 140, 14);
		panelDismiss.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Номер приказу");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(44, 139, 131, 14);
		panelDismiss.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Дата приказу на звільнення");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(44, 175, 191, 14);
		panelDismiss.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(279, 101, 86, 20);
		panelDismiss.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(279, 136, 86, 20);
		panelDismiss.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(279, 172, 86, 20);
		panelDismiss.add(textField_3);
		textField_3.setColumns(10);
		
		JButton dismissButton = new JButton("Звільнити");
		dismissButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		dismissButton.setBounds(151, 220, 108, 23);
		panelDismiss.add(dismissButton);
		
		panelWork = new JPanel();
		panelWork.setBackground(Color.PINK);
		panelWork.setBounds(0, 23, 1000, 600);
		panelWork.setVisible(flag);
		contentPane.add(panelWork);
		
		panelPass = new JPanel();
		panelPass.setBackground(Color.YELLOW);
		panelPass.setBounds(0, 23, 1000, 600);
		panelPass.setVisible(flag);
		contentPane.add(panelPass);
		
	  
	    panelEduc = new JPanel();
		panelEduc.setBackground(Color.GREEN);
		panelEduc.setBounds(0, 23, 1000, 600);
		panelEduc.setVisible(flag);
	    contentPane.add(panelEduc);
	    
	    
		
		JButton card = new JButton("Загальні відомості");
		card.setFont(new Font("Tahoma", Font.BOLD, 12));
		card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getVis();
				panelCard.setVisible(true);
				
			}
		});
		card.setBounds(0, 0, 261, 25);
		contentPane.add(card);
		
		
		
		JButton work = new JButton("Трудова діяльність");
		work.setFont(new Font("Tahoma", Font.BOLD, 12));
		work.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getVis();
				panelWork.setVisible(true);
				
			}
		});
		work.setBounds(260, 0, 250, 25);
		contentPane.add(work);
		
		
		
		JButton passport = new JButton("Паспортні дані");
		passport.setFont(new Font("Tahoma", Font.BOLD, 12));
		passport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getVis();
				panelPass.setVisible(true);
			}
		});
		
		passport.setBounds(502, 0, 250, 25);
		contentPane.add(passport);
		
		JButton education = new JButton("Освіта");
		education.setFont(new Font("Tahoma", Font.BOLD, 12));
		education.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getVis();
				panelEduc.setVisible(true);
			}
		});
		education.setBounds(750, 0, 250, 25);
		contentPane.add(education);
		
		JButton save = new JButton("Зберегти");
		save.setFont(new Font("Tahoma", Font.BOLD, 12));
		save.setBounds(20, 634, 101, 23);
		contentPane.add(save);
		
		
		
		
	}
	public void getVis(){
		JPanel []jpc = {panelWork, panelPass, panelEduc,panelCard};
		for (JPanel jPan : jpc) {
			if(!(jPan.equals(getName()))){
			jPan.setVisible (false);
		}}
		
	}
}
