
import java.util.Scanner;

public class Controller {

	Game game;
	static GUI gui;
	Scanner input;
	Controller controller;
	Problem problem;
	GradeLevel grade;
	
	void myMain() {
		game = new Game();
		gui = new GUI();
		input = new Scanner(System.in);
		grade = new GradeLevel();
		
		System.out.println("What type of math problem would you like to solve?");
		System.out.println("Enter addition, subtraction, multiplication, division or random:");
		String Mathtype = input.next();
		
		System.out.println("How many questions would you like?");
		double numberOfQuestions = input.nextDouble();
		
		game.setNumberOfQuestions(numberOfQuestions);
		
		for(int i = 0; i < numberOfQuestions; i ++) {
			
			System.out.println("\nQuestion number: " + i);
			System.out.println("-------------------");
			
			problem = new Problem(Mathtype);
		    
			gui.displayProblem(problem);
			
			System.out.println("Enter your answer?");
			
		    int response = input.nextInt();

		    game.problem(response, problem);
			 
			
			
		}
			
			//System.out.println(game.percentCorrect());
			//Displays percentage correct
			gui.displayResponseToStudent(game,grade);
		
			
			
	}
	
	
	public static void main(String args[]) {
		Controller controller = new Controller();
		controller.myMain();
		
		
	}
}
