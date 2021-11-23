
import java.util.Scanner;

public class Controller {

	Game game;
	static GUI gui;
	Scanner input;
	
	void myMain() {
		game = new Game();
		gui = new GUI();
		input = new Scanner(System.in);
		
		
	}
	
	
	
	public static void main(String args[]) {
		Controller controller = new Controller();
		controller.myMain();
		controller.gui.displayProblem(gui);
	
		System.out.println("Enter your answer:");
		
		int answer = controller.input.nextInt();

		controller.game.addition(answer);
		
		
		
		
		
		
	}
}
