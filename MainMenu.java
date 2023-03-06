package Exam2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Swing.LogIn;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class MainMenu {
	String email;
	String password;
	private JFrame frame;
	JCheckBox chckbxRememberMe;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PayPal");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(750, 300, 428, 503);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\SWING PHOTOS\\Logo.png"); 
		frame.setIconImage(icon);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel paypalLogo = new JLabel("New label");
		paypalLogo.setBounds(154, 64, 105, 27);
		frame.getContentPane().add(paypalLogo);
		
		ImageIcon logo = new ImageIcon("D:\\SWING PHOTOS\\PayPal.png");
		Image paypal = logo.getImage();
		Image modifiedLogo = paypal.getScaledInstance(100, 30, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		paypalLogo.setIcon(logo);
		
		JTextField textFieldEmail = new JTextField();
		textFieldEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldEmail.setText(null);
				textFieldEmail.setForeground(Color.BLACK);
			}
		});
		textFieldEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		textFieldEmail.setForeground(Color.GRAY);
		textFieldEmail.setText("Email or Mobile Number");
		textFieldEmail.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldEmail.setBounds(82, 102, 247, 36);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JTextField textFieldEmail2 = new JTextField();
		textFieldEmail2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldEmail2.setText(null);
				textFieldEmail2.setForeground(Color.BLACK);
			}
		});
		
		textFieldEmail2.setFont(new Font("Arial", Font.PLAIN, 14));
		textFieldEmail2.setForeground(Color.GRAY);
		textFieldEmail2.setText("Email or Numero ng Mobile");
		textFieldEmail2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldEmail2.setBounds(82, 102, 247, 36);
		frame.getContentPane().add(textFieldEmail2);
		textFieldEmail2.setColumns(10);
		textFieldEmail2.setVisible(false);
		
		JPasswordField textFieldPassword = new JPasswordField();
		textFieldPassword.getPassword();
		textFieldPassword.setEchoChar('*');
		textFieldPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldPassword.setText(null);
				textFieldPassword.setForeground(Color.BLACK);
			}
		});
		textFieldPassword.setForeground(Color.GRAY);
		textFieldPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		textFieldPassword.setText("Password");
		textFieldPassword.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(82, 161, 247, 36);
		frame.getContentPane().add(textFieldPassword);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 email = textFieldEmail.getText();
				 password = textFieldPassword.getText();
				 String fileName1 = "D:\\SWING PHOTOS\\Email.txt";
				 String fileName2 = "D:\\SWING PHOTOS\\Passwords.txt";
				 String fileName3 = "D:\\SWING PHOTOS\\Mobile.txt";
			        String[] lines = new String[100];
			        String[] lines2 = new String[100];
			        String[] lines3 = new String[100];
			        int numLines1 = 0;
			        int numLines2 = 0;
			        int numLines3 = 0;
			        
			        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
			            String line;
			            while ((line = br.readLine()) != null) {
			                lines[numLines1] = line;
			                numLines1++;
			            }
			        } catch (IOException e1) {
			            System.err.println("Error reading file: " + e1.getMessage());
			            return;
			        }
			        
			      

			        
			        try (BufferedReader br = new BufferedReader(new FileReader(fileName2))) {
			            String line;
			            while ((line = br.readLine()) != null) {
			                lines2[numLines2] = line;
			                numLines2++;
			            }
			        } catch (IOException e1) {
			            System.err.println("Error reading file: " + e1.getMessage());
			            return;
			        }
			        
			        
			        try (BufferedReader br = new BufferedReader(new FileReader(fileName3))) {
			            String line;
			            while ((line = br.readLine()) != null) {
			                lines3[numLines3] = line;
			                numLines3++;
			            }
			        } catch (IOException e1) {
			            System.err.println("Error reading file: " + e1.getMessage());
			            return;
			        }
		
			       
	
			        
			        int a = findIndex(lines, email);
			        int b =findIndex(lines2, password);
			        int c =findIndex(lines3, email);
			      
			     

			        if(a != -1 && b != -1 && a == b) {
			        	JOptionPane.showMessageDialog(btnLogIn, "Welcome");
			        	login log = new login();
			        	log.setVisible(true);
			        	frame.dispose();
			        }
			        
			        else if(c != -1 && b!= -1 && c == b) {
			        	JOptionPane.showMessageDialog(btnLogIn, "Welcome");
			        	login log = new login();
			        	log.setVisible(true);
			        	frame.dispose();		        	
			        }
			        
			        else if(a == -1 || b == -1 || c == -1) {
			        	JOptionPane.showMessageDialog(btnLogIn, "Wrong email/mobile number");
			        }
						        
			        else {
			        	JOptionPane.showMessageDialog(btnLogIn, "Wrong email/mobile number");
			        }
			}
		});
		btnLogIn.addKeyListener(new KeyAdapter() {
		});
		btnLogIn.setBackground(new Color(30, 144, 255));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Arial", Font.BOLD, 16));
		btnLogIn.setBounds(82, 208, 247, 36);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnLogIn2 = new JButton("Magpatuloy");
		btnLogIn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 email = textFieldEmail2.getText();
				 password = textFieldPassword.getText();
				 String fileName1 = "D:\\SWING PHOTOS\\Email.txt";
				 String fileName2 = "D:\\SWING PHOTOS\\Passwords.txt";
				 String fileName3 = "D:\\SWING PHOTOS\\Mobile.txt";
			        String[] lines = new String[100];
			        String[] lines2 = new String[100];
			        String[] lines3 = new String[100];
			        int numLines1 = 0;
			        int numLines2 = 0;
			        int numLines3 = 0;
			        
			        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
			            String line;
			            while ((line = br.readLine()) != null) {
			                lines[numLines1] = line;
			                numLines1++;
			            }
			        } catch (IOException e1) {
			            System.err.println("Error reading file: " + e1.getMessage());
			            return;
			        }
			        
			      

			        
			        try (BufferedReader br = new BufferedReader(new FileReader(fileName2))) {
			            String line;
			            while ((line = br.readLine()) != null) {
			                lines2[numLines2] = line;
			                numLines2++;
			            }
			        } catch (IOException e1) {
			            System.err.println("Error reading file: " + e1.getMessage());
			            return;
			        }
			        
			        
			        try (BufferedReader br = new BufferedReader(new FileReader(fileName3))) {
			            String line;
			            while ((line = br.readLine()) != null) {
			                lines3[numLines3] = line;
			                numLines3++;
			            }
			        } catch (IOException e1) {
			            System.err.println("Error reading file: " + e1.getMessage());
			            return;
			        }
		

			        
			        int a = findIndex(lines, email);
			        int b =findIndex(lines2, password);
			        int c =findIndex(lines3, email);
			      
			     

			        if(a != -1 && b != -1 && a == b) {
			        	JOptionPane.showMessageDialog(btnLogIn2, "Maligayang Pagdating");
			        	login2 log2 = new login2();
			        	log2.setVisible(true);
			        	frame.dispose();
			        }
			        
			        else if(c != -1 && b!= -1 && c == b) {
			        	JOptionPane.showMessageDialog(btnLogIn2, "Maligayang Pagdating");
			        	login2 log2 = new login2();
			        	log2.setVisible(true);
			        	frame.dispose();		        	
			        }
			        
			        else if(a == -1 || b == -1 || c == -1) {
			        	JOptionPane.showMessageDialog(btnLogIn2, "Mali ang email/mobile number");
			        }
						        
			        else {
			        	JOptionPane.showMessageDialog(btnLogIn2, "Mali ang email/mobile number");
			        }
			}
		});
		btnLogIn2.addKeyListener(new KeyAdapter() {
		});
		btnLogIn2.setBackground(new Color(30, 144, 255));
		btnLogIn2.setForeground(Color.WHITE);
		btnLogIn2.setFont(new Font("Arial", Font.BOLD, 16));
		btnLogIn2.setBounds(82, 208, 247, 36);
		frame.getContentPane().add(btnLogIn2);
		
		
		JLabel lblOr = new JLabel("---------------------- or ---------------------- ");
		lblOr.setForeground(Color.GRAY);
		lblOr.setFont(new Font("Arial", Font.PLAIN, 13));
		lblOr.setBounds(110, 316, 219, 14);
		frame.getContentPane().add(lblOr);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegForm reg = new RegForm();
				reg.setVisible(true);
				frame.dispose();
				
			}
		});
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 16));
		btnSignUp.setBackground(Color.LIGHT_GRAY);
		btnSignUp.setBounds(82, 341, 247, 36);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnSignUp2 = new JButton("Gumawa ng Account");
		btnSignUp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegForm2 reg = new RegForm2();
				reg.setVisible(true);
				frame.dispose();
			}
		});
		btnSignUp2.setForeground(Color.DARK_GRAY);
		btnSignUp2.setFont(new Font("Arial", Font.BOLD, 16));
		btnSignUp2.setBackground(Color.LIGHT_GRAY);
		btnSignUp2.setBounds(82, 341, 247, 36);
		frame.getContentPane().add(btnSignUp2);
		btnSignUp2.setVisible(false);
		
		JButton btntrouble = new JButton("Having trouble logging in?");
		btntrouble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btntrouble, "Make sure to sign up and create an account first!");
			}
		});
		btntrouble.setFont(new Font("Arial", Font.PLAIN, 12));
		btntrouble.setForeground(new Color(30, 144, 255));
		btntrouble.setBounds(132, 293, 154, 23);
		btntrouble.setBackground(null);
		btntrouble.setBorder(null);
		frame.getContentPane().add(btntrouble);
		
		JButton btntrouble2 = new JButton("Nagkaka problema sa log in?");
		btntrouble2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btntrouble2, "Siguraduhing naka pag gawa ka na ng account!");
			}
		});
		btntrouble2.setFont(new Font("Arial", Font.PLAIN, 12));
		btntrouble2.setForeground(new Color(30, 144, 255));
		btntrouble2.setBounds(132, 293, 167, 23);
		btntrouble2.setBackground(null);
		btntrouble2.setBorder(null);
		frame.getContentPane().add(btntrouble2);
		btntrouble2.setVisible(false);
		
		chckbxRememberMe = new JCheckBox("Stay Signed In");

		chckbxRememberMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		chckbxRememberMe.setForeground(new Color(30, 144, 255));
		chckbxRememberMe.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxRememberMe.setBounds(227, 255, 124, 23);
		chckbxRememberMe.setBackground(null);
		chckbxRememberMe.setBorder(null);
		frame.getContentPane().add(chckbxRememberMe);
		
		JCheckBox chckbxRememberMe2 = new JCheckBox("Manatiling naka Log In");
		chckbxRememberMe2.setForeground(new Color(30, 144, 255));
		chckbxRememberMe2.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxRememberMe2.setBounds(227, 255, 141, 23);
		chckbxRememberMe2.setBackground(null);
		chckbxRememberMe2.setBorder(null);
		frame.getContentPane().add(chckbxRememberMe2);
		chckbxRememberMe2.setVisible(false);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setForeground(new Color(30, 144, 255));
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnForgotPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		btnForgotPassword.setBackground(null);
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBounds(64, 255, 136, 23);
		frame.getContentPane().add(btnForgotPassword);
		
		JButton btnForgotPassword2 = new JButton("Nakalimutan ang Password?");
		btnForgotPassword2.setForeground(new Color(30, 144, 255));
		btnForgotPassword2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnForgotPassword2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnForgotPassword2.setBackground(null);
		btnForgotPassword2.setBorder(null);
		btnForgotPassword2.setBounds(50, 255, 167, 23);
		btnForgotPassword2.setVisible(false);
		frame.getContentPane().add(btnForgotPassword2);
		
		String languages [] = {"English", "Tagalog"};
		JComboBox comboBox = new JComboBox(languages);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object data = comboBox.getSelectedItem();
				
				
				
				if(data.equals("Tagalog")) {
					textFieldEmail2.setVisible(true);
					textFieldEmail.setVisible(false);
					btnLogIn2.setVisible(true);
					btnLogIn.setVisible(false);
					btnForgotPassword2.setVisible(true);
					btnForgotPassword.setVisible(false);
					btntrouble2.setVisible(true);
					btntrouble.setVisible(false);
					btnSignUp2.setVisible(true);
					btnSignUp.setVisible(false);
					chckbxRememberMe2.setVisible(true);
					chckbxRememberMe.setVisible(false);
				}
				else {
					textFieldEmail.setVisible(true);
					textFieldEmail2.setVisible(false);
					btnLogIn2.setVisible(false);
					btnLogIn.setVisible(true);
					btnForgotPassword2.setVisible(false);
					btnForgotPassword.setVisible(true);
					btntrouble2.setVisible(false);
					btntrouble.setVisible(true);
					btnSignUp2.setVisible(false);
					btnSignUp.setVisible(true);
					chckbxRememberMe2.setVisible(false);
					chckbxRememberMe.setVisible(true);
				}
			}
		});
		
		comboBox.setBounds(165, 388, 105, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnShow = new JButton("");
		btnShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textFieldPassword.setEchoChar((char)0);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textFieldPassword.setEchoChar('*');
			}
		});
		btnShow.setBackground(null);
		btnShow.setBorder(null);
		ImageIcon show = new ImageIcon("D:\\SWING PHOTOS\\show.png");
		Image showimg = show.getImage();
		Image modifiedshow = showimg.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		show = new ImageIcon(modifiedshow);
		btnShow.setIcon(show);

		btnShow.setBounds(339, 161, 49, 36);
		frame.getContentPane().add(btnShow);
	}
	
	public void setVisible(boolean a) {
		frame.setVisible(a);
	}
	public static int findIndex(String[] lines, String t)
    {
        // Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();
  
        // adding elements of array
        // to ArrayList
        for (String i : lines)
            clist.add(i);
  
        // returning index of the element
        return clist.indexOf(t);
    }
}
