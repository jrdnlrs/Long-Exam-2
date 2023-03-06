package Exam2;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Swing.Main;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RegForm2 {
	static String email;
	static String password;
	static String mobile;
	JFrame frame;
	static String data;
	private JFrame frame_1;
	private JTextField textFieldfirstN;
	private JTextField textFieldlastN;
	private JTextField textFieldemail;
	private JTextField textFieldmobileno;
	private JTextField textFieldpassword;
	private JTextField textFieldpassword2;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblEmail;
	private JLabel lblMobileNumber;
	private JLabel lblPassword;
	private JLabel lblRepeatPassword;
	private JLabel lblLogo;
	private JButton btnRegister;
	private JButton btnBack;
	
	public RegForm2() {
		
		frame_1 = new JFrame("Registration Form");
		frame_1.setBackground(new Color(255, 255, 255));
		frame_1.getContentPane().setBackground(new Color(255, 255, 255));
		frame_1.setBounds(650, 200, 455, 590);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\SWING PHOTOS\\Logo.png"); 
		frame_1.setIconImage(icon);
		frame_1.setResizable(false);
		
		textFieldfirstN = new JTextField();
		textFieldfirstN.setBounds(115, 68, 251, 38);
		textFieldfirstN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		frame_1.getContentPane().setLayout(null);
		ImageIcon check = new ImageIcon("D:\\SWING PHOTOS\\check.jpg");
		Image checkimg = check.getImage();
		Image modifiedcheck = checkimg.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		check = new ImageIcon(modifiedcheck);
		
		
		textFieldfirstN.setForeground(Color.BLACK);
		frame_1.getContentPane().add(textFieldfirstN);
		textFieldfirstN.setColumns(10);
		
		textFieldlastN = new JTextField();
		textFieldlastN.setBounds(115, 135, 251, 38);
		textFieldlastN.setColumns(10);
		frame_1.getContentPane().add(textFieldlastN);
		
		textFieldemail = new JTextField();
		textFieldemail.setBounds(115, 213, 251, 38);
		textFieldemail.setColumns(10);
		frame_1.getContentPane().add(textFieldemail);
		
		textFieldmobileno = new JTextField();
		textFieldmobileno.setBounds(115, 278, 251, 38);
		textFieldmobileno.setColumns(10);
		frame_1.getContentPane().add(textFieldmobileno);
		
		textFieldpassword = new JTextField();
		textFieldpassword.setBounds(115, 349, 251, 38);
		textFieldpassword.setColumns(10);
		frame_1.getContentPane().add(textFieldpassword);
		
		textFieldpassword2 = new JTextField();
		textFieldpassword2.setBounds(115, 417, 251, 38);
		textFieldpassword2.setColumns(10);
		frame_1.getContentPane().add(textFieldpassword2);
		
		lblFirstName = new JLabel("Pangalan");
		lblFirstName.setBounds(10, 67, 87, 38);
		lblFirstName.setFont(new Font("Arial", Font.PLAIN, 14));
		frame_1.getContentPane().add(lblFirstName);
		
		lblLastName = new JLabel("Apelyido");
		lblLastName.setBounds(10, 140, 87, 26);
		lblLastName.setFont(new Font("Arial", Font.PLAIN, 14));
		frame_1.getContentPane().add(lblLastName);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 218, 87, 26);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		frame_1.getContentPane().add(lblEmail);
		
		lblMobileNumber = new JLabel("Numero ng Mobile");
		lblMobileNumber.setBounds(10, 284, 110, 26);
		lblMobileNumber.setFont(new Font("Arial", Font.PLAIN, 12));
		frame_1.getContentPane().add(lblMobileNumber);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 354, 87, 26);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		frame_1.getContentPane().add(lblPassword);
		
		lblRepeatPassword = new JLabel("Ulitin ang Password");
		lblRepeatPassword.setBounds(10, 423, 110, 26);
		lblRepeatPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		frame_1.getContentPane().add(lblRepeatPassword);
		
		lblLogo = new JLabel("New label");
		lblLogo.setBounds(171, 11, 105, 43);
		frame_1.getContentPane().add(lblLogo);
		ImageIcon paypal = new ImageIcon("D:\\SWING PHOTOS\\PayPal.png");
		Image logo = paypal.getImage();
		Image modifiedLogo = logo.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH);
		paypal = new ImageIcon(modifiedLogo);
		lblLogo.setIcon(paypal);
		
		btnRegister = new JButton("Gawin ang account");
		btnRegister.setBounds(107, 483, 246, 38);
		btnRegister.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				

				String first = textFieldfirstN.getText();
				String last = textFieldlastN.getText();
				String password2 = textFieldpassword2.getText();
				mobile = textFieldmobileno.getText();
				email = textFieldemail .getText();
				password = textFieldpassword.getText();
			
				data = "";
				
			    try {
			        FileWriter myWriter = new FileWriter("D:\\SWING PHOTOS\\Email.txt",true);
			        FileWriter myWriter2 = new FileWriter("D:\\SWING PHOTOS\\Mobile.txt", true);
			        FileWriter myWriter3 = new FileWriter("D:\\SWING PHOTOS\\Passwords.txt",true);
			        
			        if(isExisting() == true) {
			        JOptionPane.showMessageDialog(btnRegister, "Meron nang nagmamay ari ng email/mobile number na ito!");
			        
			        }
			        else if (first.equals("") || last.equals("") || password2.equals("") || mobile.equals("") || password.equals("") || email.equals("")){
			        JOptionPane.showMessageDialog(btnRegister, "SAGUTAN LAHAT!");
			        }
			        else if(email.contains("@") == false || email.contains(".com") == false) {
			        JOptionPane.showMessageDialog(btnRegister, "Di-wastong Email!");
			        }
			        else if(password.contains("!") == false && password.contains("@") == false && password.contains("#") == false && password.contains("$") ==false && password.contains("%") == false && password.contains("^") == false && password.contains("&") == false && password.contains("*") == false)
			        {
			        JOptionPane.showMessageDialog(btnRegister, "Ang password mo ay madaling mahulaan! Siguraduhing meron kang mga espesyal na karakter gaya ng '!' o '@'");
			        }


			        else {
			        	JOptionPane.showMessageDialog(btnRegister, "Nagawa na ang account!");
			        	myWriter.write(email + "\n");
			        	myWriter2.write(mobile + "\n");
			        	myWriter3.write(password + "\n");
			        	}
			        
			        myWriter3.close();
			        myWriter2.close();
			        myWriter.close();
			        
			      } 
			    catch (IOException a) {
			        JOptionPane.showMessageDialog(btnRegister, "An error occured");
			        a.printStackTrace();
			      }

			   
			}
		});
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setForeground(Color.DARK_GRAY);
		btnRegister.setFont(new Font("Arial", Font.PLAIN, 16));
		frame_1.getContentPane().add(btnRegister);
		
		btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu menu = new MainMenu();
				
				frame_1.dispose();
				
				menu.setVisible(true);
			}
		});
		
		btnBack.setBounds(10, 11, 33, 38);
		frame_1.getContentPane().add(btnBack);
		btnBack.setBackground(null);
		
		btnBack.setBorder(null);
		ImageIcon back = new ImageIcon("D:\\SWING PHOTOS\\back.png");
		Image img = back.getImage();
		Image modifiedimg = img.getScaledInstance(20, 30, java.awt.Image.SCALE_SMOOTH);
		back = new ImageIcon(modifiedimg);
		btnBack.setIcon(back);
		

		}

	public void setVisible() {
		frame_1.setVisible(true);
		
	}
	
	static boolean isExisting() {
		try {
		FileReader file1 = new FileReader("D:\\SWING PHOTOS\\Email.txt");
		BufferedReader br1 = new BufferedReader(file1);
		
		FileReader file2 = new FileReader("D:\\SWING PHOTOS\\Mobile.txt");
		BufferedReader br2 = new BufferedReader(file2);
		
		while ((data = br1.readLine()) != null) {
				
		if(email.equals(data)) {
						
		return true;
		}	
		}
		br1.close();
		while ((data = br2.readLine()) != null) {

			if(mobile.equals(data)) {
				
				return true;
				}	
			 
		}
		br2.close();
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void setVisible(boolean a) {
		frame_1.setVisible(a);
	}
}


