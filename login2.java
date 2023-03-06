package Exam2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Swing.Main;
import Swing.Student1;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;



public class login2 {
	String id,first,last;
	Object course;
	boolean gold,blue,white;
	JComboBox comboCourse;
	JFrame frame;
	private JTextField textIdNum;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JLabel lblStudentType;
	private JRadioButton rdbtnGold;
	private JRadioButton rdbtnBlue;
	private JRadioButton rdbtnWhite;
	private JButton btnCheckTuition;
	private JButton btnEnroll;
	private JLabel lblHeader;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	{
		frame = new JFrame("PayPal");
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setBounds(750, 300, 578, 703);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\SWING PHOTOS\\Logo.png"); 
		frame.setIconImage(icon);
		frame.setVisible(true);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu main = new MainMenu();
				
				frame.dispose();
				
				main.setVisible(true);
			}
		});
		
		btnBack.setBounds(10, 11, 33, 38);
		frame.getContentPane().add(btnBack);
		btnBack.setBackground(null);
		
		btnBack.setBorder(null);
		ImageIcon back = new ImageIcon("D:\\SWING PHOTOS\\back.png");
		Image img = back.getImage();
		Image modifiedimg = img.getScaledInstance(20, 30, java.awt.Image.SCALE_SMOOTH);
		back = new ImageIcon(modifiedimg);
		btnBack.setIcon(back);
		
		
		String [] type = {"Discounted" , "Walk-In", "Continuing"};
		JComboBox comboStudentType = new JComboBox(type);
		comboStudentType.setFont(new Font("Arial", Font.PLAIN, 14));
		comboStudentType.setBackground(null);
		comboStudentType.setBorder(null);
		comboStudentType.setFocusable(false);
		comboStudentType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object data = comboStudentType.getSelectedItem();
				gold = rdbtnGold.isSelected();
				blue = rdbtnBlue.isSelected();
				white = rdbtnWhite.isSelected();
				
				if(data.equals("Walk-In")) {
					rdbtnGold.setVisible(false);
					rdbtnBlue.setVisible(false);
					rdbtnWhite.setVisible(false);
					
					gold = false;
					blue = false;
					white = false;
					
					comboCourse.setBounds(119, 345, 324, 38);
				}
				else if(data.equals("Continuing")) {
					rdbtnGold.setVisible(false);
					rdbtnBlue.setVisible(false);
					rdbtnWhite.setVisible(false);
					
					gold = false;
					blue = false;
					white = false;
					
					comboCourse.setBounds(119, 345, 324, 38);
				}
				else {
					rdbtnGold.setVisible(true);
					rdbtnBlue.setVisible(true);
					rdbtnWhite.setVisible(true);

					comboCourse.setBounds(119, 428, 324, 38);
				}
			}
		});
		comboStudentType.setBounds(119, 277, 324, 38);
		frame.getContentPane().add(comboStudentType);
		
		String [] courses = {"Tourism", "Computer Science", "Engineering", "Nursing", "Architecture"};
		comboCourse = new JComboBox(courses);
		comboCourse.setFont(new Font("Arial", Font.PLAIN, 14));
		comboCourse.setBackground(null);
		comboCourse.setBorder(null);
		comboCourse.setFocusable(false);
		comboCourse.setBounds(119, 428, 324, 38);
		frame.getContentPane().add(comboCourse);
		
		textIdNum = new JTextField();
		textIdNum.setForeground(Color.GRAY);
		textIdNum.setFont(new Font("Arial", Font.PLAIN, 14));
		textIdNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textIdNum.setText(null);
				textIdNum.setForeground(Color.BLACK);
			}
		});
		textIdNum.addKeyListener(new KeyAdapter() {

		});
		textIdNum.setText("ID Number");
		textIdNum.setBounds(119, 70, 327, 38);
		frame.getContentPane().add(textIdNum);
		textIdNum.setColumns(10);
		
		textFirstName = new JTextField();
		textFirstName.setForeground(Color.GRAY);
		textFirstName.setFont(new Font("Arial", Font.PLAIN, 14));
		textFirstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFirstName.setText(null);
				textFirstName.setForeground(Color.BLACK);
			}
		});
		textFirstName.addKeyListener(new KeyAdapter() {

		});
		textFirstName.setText("Pangalan");
		textFirstName.setBounds(119, 140, 324, 38);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10);
		
		textLastName = new JTextField();
		textLastName.setForeground(Color.GRAY);
		textLastName.setFont(new Font("Arial", Font.PLAIN, 14));
		textLastName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textLastName.setText(null);
				textLastName.setForeground(Color.BLACK);
			}
		});
		textLastName.addKeyListener(new KeyAdapter() {

		});
		textLastName.setText("Apelyido");
		textLastName.setBounds(119, 203, 324, 38);
		frame.getContentPane().add(textLastName);
		textLastName.setColumns(10);
		
		lblStudentType = new JLabel("Uri ng Estudyante");
		lblStudentType.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStudentType.setBounds(119, 252, 120, 20);
		frame.getContentPane().add(lblStudentType);
		
		rdbtnGold = new JRadioButton("Gold");
		rdbtnGold.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnGold.setBackground(null);
		rdbtnGold.setBorder(null);
		rdbtnGold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(rdbtnGold);
		rdbtnGold.setBounds(119, 326, 109, 23);
		frame.getContentPane().add(rdbtnGold);

		
		rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnBlue.setBackground(null);
		rdbtnBlue.setBorder(null);
		buttonGroup.add(rdbtnBlue);
		rdbtnBlue.setBounds(119, 360, 109, 23);
		frame.getContentPane().add(rdbtnBlue);
		
		rdbtnWhite = new JRadioButton("White");
		rdbtnWhite.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnWhite.setBackground(null);
		rdbtnWhite.setBorder(null);
		buttonGroup.add(rdbtnWhite);
		rdbtnWhite.setBounds(119, 394, 109, 23);
		frame.getContentPane().add(rdbtnWhite);
		
		btnCheckTuition = new JButton("Icheck kung magkano");
		btnCheckTuition.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCheckTuition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			id = textIdNum.getText();
			first = textFirstName.getText();
			last = textLastName.getText();
			course = comboCourse.getSelectedItem();
			String color = "";
			Object data = comboStudentType.getSelectedItem();
			
			
			
			if(id.equals("") || first.equals("") || last.equals("") || data.equals("")) {
				JOptionPane.showMessageDialog(comboStudentType, "SAGUTAN LAHAT");
			}
			
			else if(id.equals("ID Number") || first.equals("First Name") || last.equals("") || data.equals("Last Name")) {
				JOptionPane.showMessageDialog(comboStudentType, "SAGUTAN LAHAT!");
			}
			
			else if(data.equals("Discounted")) {
			if(gold = rdbtnGold.isSelected()){
				color = "Gold";
				Student student = new Student(id,first,last,color,course);
				int a = JOptionPane.showConfirmDialog(btnCheckTuition, student.toString(), "PLEASE CONFIRM", 0);
				if (a == 1) {
					
				}
				else {
					student.course(course);
					student.tuition(color);
				}
			}
			else if(blue = rdbtnBlue.isSelected()){
				color = "Blue";
				Student student = new Student(id,first,last,color,course);
				int a = JOptionPane.showConfirmDialog(btnCheckTuition, student.toString(), "PLEASE CONFIRM", 0);
				if (a == 1) {
					
				}
				else {
					student.course(course);
					student.tuition(color);
				}
			}
			else if (white = rdbtnWhite.isSelected()){
				color = "White";
				Student student = new Student(id,first,last,color,course);
				int a = JOptionPane.showConfirmDialog(btnCheckTuition, student.toString(), "PLEASE CONFIRM", 0);
				if (a == 1) {
					
				}
				else {
					student.course(course);
					student.tuition(color);
				}
			}
			
			}
			
			else if(data.equals("Continuing")) {
				color = "Continuing";
				Student student = new Student(id,first,last,color,course);
				int a = JOptionPane.showConfirmDialog(btnCheckTuition, student.toString(), "PLEASE CONFIRM", 0);
				if (a == 1) {
					
				}
				else {
					student.course(course);
					student.tuition(color);
				}
			}
			
			else {
				color ="Walk-In";
				Student student = new Student(id,first,last,color,course);
				int a = JOptionPane.showConfirmDialog(btnCheckTuition, student.toString(), "PLEASE CONFIRM", 0);
				if (a == 1) {
					
				}
				else {
					student.course(course);
					student.tuition(color);
				}
			}
						
			}});
		btnCheckTuition.setBounds(119, 496, 175, 44);
		frame.getContentPane().add(btnCheckTuition);
		
		btnEnroll = new JButton("Mag Enroll");
		btnEnroll.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnroll.setBounds(317, 496, 126, 44);
		frame.getContentPane().add(btnEnroll);
		btnEnroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = textIdNum.getText();
				first = textFirstName.getText();
				last = textLastName.getText();
				course = comboCourse.getSelectedItem();
				String color = "";
				Object data = comboStudentType.getSelectedItem();
				
				if(id.equals("") || first.equals("") || last.equals("") || data.equals("")) {
					JOptionPane.showMessageDialog(comboStudentType, "SAGUTAN LAHAT!");
				}
				else {
					
					JOptionPane.showMessageDialog(comboStudentType, "Naenroll na ang estudyante! Hintayin ang resibo.");
					frame.dispose();
					JFrame frame2 = new JFrame("RECEIPT");
					frame2.setVisible(true);
					frame2.getContentPane().setBackground(new Color(255, 255, 255));
					frame2.setBounds(750, 300, 428, 503);
					Image icon = Toolkit.getDefaultToolkit().getImage("D:\\SWING PHOTOS\\Logo.png"); 
					frame2.setIconImage(icon);
					frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame2.getContentPane().setLayout(null);
					frame2.setResizable(false);
					
					JLabel lblIdNum = new JLabel("ID Num:" + id);
					lblIdNum.setFont(new Font("Arial", Font.PLAIN, 16));
					lblIdNum.setBounds(10, 11, 366, 26);
					frame2.getContentPane().add(lblIdNum);
					
					JLabel lblFirstName = new JLabel("Pangalan:" + first);
					lblFirstName.setFont(new Font("Arial", Font.PLAIN, 16));
					lblFirstName.setBounds(10, 48, 366, 26);
					frame2.getContentPane().add(lblFirstName);
					
					JLabel lblLastName = new JLabel("Apelyido:" + last);
					lblLastName.setFont(new Font("Arial", Font.PLAIN, 16));
					lblLastName.setBounds(10, 85, 366, 26);
					frame2.getContentPane().add(lblLastName);
					
					if(data.equals("Discounted")) {
						if(gold = rdbtnGold.isSelected()){
							color = "Gold";
						}
						
						else if (blue = rdbtnBlue.isSelected()) {
							color = "Blue";
						}
						
						else if (white = rdbtnWhite.isSelected()) {
							color = "White";
						}
					}
					
					else if (data.equals("Continuing")) {
						color = "Continuing";
					}
					
					else {
						color="Walk-In";
					}
					
					JLabel lblStudentType = new JLabel("Uri ng Estudyante:" + color);
					lblStudentType.setFont(new Font("Arial", Font.PLAIN, 16));
					lblStudentType.setBounds(10, 122, 366, 26);
					frame2.getContentPane().add(lblStudentType);
					
					
					JLabel lblCourse = new JLabel("Kurso:" + course);
					lblCourse.setFont(new Font("Arial", Font.PLAIN, 16));
					lblCourse.setBounds(10, 159, 366, 26);
					frame2.getContentPane().add(lblCourse);
					
					JLabel lblThanks = new JLabel("MARAMING SALAMAT SA PAG TANGKILIK!");
					lblThanks.setFont(new Font("Arial", Font.BOLD, 19));
					lblThanks.setBounds(23, 232, 379, 122);
					lblThanks.setBackground(null);
					frame2.getContentPane().add(lblThanks);
					
					JLabel lbldate = new JLabel("Petsa: 3/6/2023");
					lbldate.setFont(new Font("Arial", Font.PLAIN, 12));
					lbldate.setBounds(23, 309, 91, 14);
					frame2.getContentPane().add(lbldate);
					
					JLabel lbltype = new JLabel("Enrollment Type: Online");
					lbltype.setFont(new Font("Arial", Font.PLAIN, 12));
					lbltype.setBounds(23, 334, 145, 14);
					frame.getContentPane().add(lbltype);
					
					JLabel lblname = new JLabel("Cashier Name: Vonn Jerriel V. Rosario");
					lblname.setFont(new Font("Arial", Font.PLAIN, 12));
					lblname.setBounds(23, 365, 226, 14);
					frame2.getContentPane().add(lblname);
					
					
					JLabel lblTuitionFee = new JLabel("Status: BAYAD");
					
					lblTuitionFee.setFont(new Font("Arial", Font.PLAIN, 16));
					lblTuitionFee.setBounds(10, 196, 366, 26);
					frame2.getContentPane().add(lblTuitionFee);		
			
				}
			}
		});
		lblHeader = new JLabel("HONORATA NATIONAL SCHOOL");
		lblHeader.setFont(new Font("Arial", Font.BOLD, 16));
		lblHeader.setBounds(147, 11, 251, 21);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblEnrollmentSystem = new JLabel("ENROLLMENT SYSTEM");
		lblEnrollmentSystem.setFont(new Font("Arial", Font.BOLD, 16));
		lblEnrollmentSystem.setBounds(175, 28, 251, 21);
		frame.getContentPane().add(lblEnrollmentSystem);

}

public void setVisible(boolean b) {
	frame.setVisible(true);
}
}
