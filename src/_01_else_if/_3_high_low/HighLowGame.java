
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(501);
		
		// 2. Print out the random variable above
		//System.out.print(random);
		// 11. Repeat steps 1 to 10 ten times
		for ( int i = 0; i < 10; i++){
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String answer = JOptionPane.showInputDialog("guess what the number is"); 
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int answer2=Integer.parseInt(answer);
			// 5. if the guess is correct
			if (answer2==random) {
				//6. Win
			JOptionPane.showMessageDialog(null, "Congrats! You beat the game");
				
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
				System.exit(0);
			}
			// 7. if the guess is high 
				if (answer2>random) {
					JOptionPane.showMessageDialog(null, "your answer is too high");
				}
				// 8. Tell them it's too high`
				
			// 9. if the guess is low
				if (answer2<random) {
					JOptionPane.showMessageDialog(null, "your answer is too low");
				}
				// 10. Tell them it's too low
					
		// 13. Tell them they lose
		
		}
		}
		

}


