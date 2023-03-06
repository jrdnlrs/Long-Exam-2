package Exam2;

import javax.swing.JOptionPane;

public class Student {
	
	//initializing student attributes
	String idNum;
	String firstName;
	String lastName;
	String studentType;
	Object courseName;
	double tf;
	double mc;
	double total;
	
	//parameterized constructor
	public Student(String idNum, String firstName, String lastName, String studentType, Object courseName){
		this.idNum = idNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentType = studentType;
		this.courseName = courseName;
	}
	
	//to print the credentials to the console
	public String toString() {
		return "ID Number: "+this.idNum + "\n" + "First Name: "+this.firstName + "\n" + "Last Name: "+this.lastName + "\n" + "Student Type: "+this.studentType + "\n" + "Course: "+this.courseName;
	}
		
	//Tuition fee of each courses
	public void course (Object courseName){
		
		if(this.courseName.equals("Tourism")) {
			tf = 10000;
			mc = 22500;
		}
		
		if(this.courseName.equals("Computer Science")) {
			tf = 20000;
			mc = 11000;
		}
		
		if(this.courseName.equals("Engineering")) {
			tf = 30000;
			mc = 25000;
		}
		
		if(this.courseName.equals("Nursing")) {
			tf = 15000;
			mc = 15000;
		}
		
		if(this.courseName.equals("Architecture")) {
			tf = 25000;
			mc = 23000;
		}
		
		total = mc + tf;
	}
	
	//Discounting based on student type
	public double tuition(String studentType) {
		if (this.studentType.equalsIgnoreCase("Gold")) {
			total = total / 2;
			JOptionPane.showMessageDialog(null, "Tuition Fee(Complete): "+"₱" + total);
			return total;
			
		}
		
		if (this.studentType.equalsIgnoreCase("Blue")) {
			total = total * .7;
		
			JOptionPane.showMessageDialog(null, "Tuition Fee(Complete): "+"₱" + total);
			
			return total;
		}
		
		if (this.studentType.equalsIgnoreCase("White")) {
			total = total *.9;
			JOptionPane.showMessageDialog(null, "Tuition Fee(Complete): "+"₱" + total);
			
			return total;
		}
		
		if (this.studentType.equalsIgnoreCase("Continuing")) {
			tf = tf * .9;
			total = tf + mc;
			JOptionPane.showMessageDialog(null, "Tuition Fee(Complete): "+"₱" + total);
			
			return total;
		}
		
		if (this.studentType.equalsIgnoreCase("Walk-in")) {
			JOptionPane.showMessageDialog(null, "Tuition Fee(Complete): "+"₱" + total);
			return total;
		}
		else {
			return total;
		}
	}
	
}