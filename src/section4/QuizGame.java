package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0 ;
		// 2.  Ask the user a question 
		String billy = JOptionPane.showInputDialog(null , "What family is the Cockatiel in?") ;
		// 3.  Use an if statement to check if their answer is correct
		if(billy.equalsIgnoreCase("The Cockatoo Family")) {
			score++ ;
		 JOptionPane.showMessageDialog(null, "Remember to put a 'the' in front of all your answers, such as 'the cockatiel' for example. Good luck!");
			JOptionPane.showMessageDialog(null, "You are correct!");
		}
		// 4.  if the user's answer was correct, add one to their score 
	
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String qwerty = JOptionPane.showInputDialog(null ,"What is the smartest bird?") ;
		if(qwerty.equalsIgnoreCase("The Crow")) {
			score++ ;
			JOptionPane.showMessageDialog(null, "You are correct!");
		}
		String bill = JOptionPane.showInputDialog(null , "What is the most popular pet bird?") ;
		if (bill.equalsIgnoreCase("The Budgie")) {
		score++ ;
		JOptionPane.showMessageDialog(null , "You are correct!") ;
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
	}
}
