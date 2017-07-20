package day3;

import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class High_Low_Game {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(1048576);
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		for (int i=1; i<21; i++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess the random number between 1 and 1048576");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int g = Integer.parseInt(guess);
			// 5. if the guess is correct
			if(g == random){
				JOptionPane.showMessageDialog(null, "You win!");
				i=21;
				// 6. win
			}
			else{
				if(g > random){
				// 7. if the guess is high
					// 8. tell them it's too high
					JOptionPane.showMessageDialog(null, "Your guess is too high!");
				}
				if(g < random){
					// 9. if the guess is low
						// 10. tell them it's too low
						JOptionPane.showMessageDialog(null, "Your guess is too low!");
					}
			}

		}
		// 12. tell them they lose
	}

}
