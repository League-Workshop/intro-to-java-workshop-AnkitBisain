package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
	
			String N = "Ankit" ;
			JOptionPane.showMessageDialog( null, "Hello " + N );
			String A = JOptionPane.showInputDialog("Enter your favorite color");
			JOptionPane.showMessageDialog(null, A );
			if (A.equals("green")){
				JOptionPane.showMessageDialog(null, "Green is not a creative color" );
			}
			else {
				JOptionPane.showMessageDialog(null, "What's your favorite idea?" );
			}
		
	}
}
