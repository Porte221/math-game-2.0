
import java.util.Scanner;

public class Controller {

	Game game;
	static GUI gui;
	Scanner input;
	Controller controller;
	Problem problem;
	
	void myMain() {
		game = new Game();
		gui = new GUI();
		input = new Scanner(System.in);
		
		System.out.println("What type of math problem would you like to solve?");
		String Mathtype  = input.next();
		
	    problem = new Problem(Mathtype);
	    
		gui.displayProblem(problem);
		
		System.out.println("Enter your answer:");
		
	    int response = input.nextInt();

		game.problem(response, problem);
	}
	
	
	
	public static void main(String args[]) {
		Controller controller = new Controller();
		controller.myMain();
		
	
		
		
		
		
		
		
	}
}
