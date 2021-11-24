import java.util.Random;

public class Game {
	
	//Create new random number generator
	private final Random rand = new Random();
	
	//Create a controller object
	private int answer;
	

		
	
	
    public int problem(int guess, Problem problem) {
    	
    
    	int answer = problem.getAnswer();
    	
    	
    	if( guess != answer) {
    		System.out.println("incorrect");
    	}
    		
    	System.out.println("correct");
    	return guess;
	

    }//End method addition

	
	
	
	
	
	
	
	
	
}

