package day3;

import javax.swing.JOptionPane;

public class Quiz_Game {
	public static void main(String[] args) {

		// Question 1
		int i = 0;
		String Q = "What is arctan(1/2)+arctan(1/3)? Express your answer in degrees.";
		String A = "45";
		String U = JOptionPane.showInputDialog(Q);
		if(U.equals(A)){
			i++;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		
		// Question 2
		Q = "How many positive integers between 1 and 30, inclusive, cannot be expressed as a difference of 2 squares?";
		A = "8";
		U = JOptionPane.showInputDialog(Q);
		if(U.equals(A)){
			i++;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		// Question 3
		Q = "What is 8!?";
		A = "40320";
		U = JOptionPane.showInputDialog(Q);
		if(U.equals(A)){
			i++;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}

		// Question 4
		Q = "What is the area of a triangle with side lengths 13, 14, and 15";
		A = "84";
		U = JOptionPane.showInputDialog(Q);
		if(U.equals(A)){
			i++;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		// Question 5
		Q = "What is 2^20?";
		A = "1048576";
		U = JOptionPane.showInputDialog(Q);
		if(U.equals(A)){
			i++;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		JOptionPane.showMessageDialog(null, "Congratulations!\nYour score is " + 20*i + "%");
		
 }
}
