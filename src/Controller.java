
public class Controller {

	Game game;
	GUI gui;
 	
	void myMain() {
		game = new Game();
		gui = new GUI();
		
	}
	
	public static void main(String args[]) {
		Controller controller = new Controller();
		controller.myMain();
		System.out.println("running");
		System.out.println("running");

	}
}
