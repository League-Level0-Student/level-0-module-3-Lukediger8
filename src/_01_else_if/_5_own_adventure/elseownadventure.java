package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class elseownadventure {
public static void main(String[] args) {
	
	
	
	JOptionPane.showMessageDialog(null, "Welcome to One Piece ");
	
	String answer = JOptionPane.showInputDialog(null,"Are you ready for the journey?");
	
	if (answer.equals("yes")) {
		JOptionPane.showMessageDialog(null, "alright, for your first misssion you will have to go into territory and steal their gold");
		String answer2 = JOptionPane.showInputDialog(null,"are you up for the task");
		if (answer2.equals("yes")) {
			String answer3=JOptionPane.showInputDialog(null,"you have encountered a monster from the enemy territory, would you like to kill it?");
			
			if (answer3.equals("yes")) {
			String attack = JOptionPane.showInputDialog("what move would you like to do");
			if (attack.equals("spinning kick")) {
				JOptionPane.showInputDialog(null,"the creature is down to %75, what move do you want to do next ");
				if (attack.equals("dragon punch")) {
					JOptionPane.showInputDialog(null,"the creature is down to %50, what move would you like to do next?");
				}
			}
			
			}
			
		}
		
		
		
if (answer.equals("no")) {
		JOptionPane.showMessageDialog(null,"get outa here failure");	
		}
	}
	
	
	
	
	
	
	
	
	
	
}
}
