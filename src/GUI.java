

public class GUI {
	
	private double result,percent;
	
	
	public void displayResponseToStudent(Game game, GradeLevel grade) {
		
		result = game.percentCorrect();
		System.out.printf("Percentage correct: %.2f %s",result,"%");
		
		percent = grade.grade(result);
		
	}
	
	
	public void displayProblem(Problem problem) {
		

		String question = problem.getProblem();
		
		System.out.println(question);
	}
	
}
