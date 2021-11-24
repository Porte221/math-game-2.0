import java.util.Random;

public class Problem {


	//Create new random number generator
	private final static Random rand = new Random();
	private int num1, num2, answer;
	private String mathtype;
	

	public void setAnswer(int answer) {
		this.answer = answer;
	}



	public int getNum1() {
		return num1;
	}



	public void setNum1(int num1) {
		this.num1 = num1;
	}



	public int getNum2() {
		return num2;
	}



	public void setNum2(int num2) {
		this.num2 = num2;
	}



	public Random getRand() {
		return rand;
	}



	//Constructor for the problems
	public Problem(String mathtype) {
		this.mathtype = mathtype;

	}


	public String getProblem() {
		
		switch(mathtype) {
		case "addition": return addition();
		
		case "multiplication": return multiplication();
		
		default: 
			return addition();
		}
	}
	
	public String addition() {
		
		int num1 = (1 + rand.nextInt(9));
		int num2 = (1 + rand.nextInt(9));
		
		
		String question = "What is: " + num1+ " + " +num2;
		
		answer = num1 + num2;
		
		
		return question ;
	}
	public String multiplication() {
		
		int num1 = (1 + rand.nextInt(9));
		int num2 = (1 + rand.nextInt(9));
		
		String question = "What is: " + num1+ " * " +num2;
		
		answer = num1 * num2;
		
		
		return question;
	}



	public int getAnswer() {
		
		return answer;
	}
}
