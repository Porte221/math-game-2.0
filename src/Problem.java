import java.util.Random;

public class Problem {


	//Create new random number generator
	private final static Random rand = new Random();
	private int num1, num2;
	

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
	public Problem() {

	}


	
	public int addition() {
		
		int num1 = (1 + rand.nextInt(9));
		int num2 = (1 + rand.nextInt(9));
		
		System.out.println("What is: " + num1+ " + " +num2);
		
		int sum = num1 + num2;
		
		return sum;
	}
}
