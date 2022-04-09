package _01_else_if._5_own_adventure;

import java.net.URI;

import javax.swing.JOptionPane;

public class elseownadventure {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Welcome to One Piece ");

		String answer = JOptionPane.showInputDialog(null, "Are you ready for the journey?");

		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null,
					"alright, for your first misssion you will have to go into territory and steal their gold");
			String answer2 = JOptionPane.showInputDialog(null, "are you up for the task");
			if (answer2.equals("yes")) {
				String answer3 = JOptionPane.showInputDialog(null,
						"you have encountered a monster from the enemy territory, would you like to kill it?");

				if (answer3.equals("yes")) {
					String attack = JOptionPane.showInputDialog("what move would you like to do");
					if (attack.equals("spinning kick")) {
						attack = JOptionPane.showInputDialog(null,
								"the creature is down to %75, what move do you want to do next ");

					} else if (attack.equals("dragon punch")) {
						JOptionPane.showInputDialog(null,
								"the creature is down to %50, what move would you like to do next?");

					} else if (attack.equals("galaxy isolation")) {
						JOptionPane.showMessageDialog(null, "The creature has been defeated! Congratulations!");
					}
					String bury = JOptionPane.showInputDialog(null, "Would you like to bury the gold?");
					if (bury.equals("yes")) {
						JOptionPane.showMessageDialog(null,
								"you planted the treasure in a mysterious island than your boat sailed away and you died from thirst and hunger.");
					}
					if (bury.equals("no")) {
						JOptionPane.showMessageDialog(null, "your gold got stolen and you got killed");
						JOptionPane.showMessageDialog(null, "TO BE CONTINUED...");
					}
						playVideo("https://www.youtube.com/watch?v=7uBqNgxAuBA");
				}

				if (answer.equals("no")) {
					JOptionPane.showMessageDialog(null, "get outa here failure");
				}
				
			}
		}
	}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}