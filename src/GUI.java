

public class GUI {
	
	GradeLevel Query_the_grade_level() {
		GradeLevel retVal = null;
		
		
		return retVal;
	}
	
	public void displayResponseToStudnet() {
		
	}
	
	public void displayProblem(Problem problem) {
		
		System.out.println("Solve this problem");

		String question = problem.getProblem();
		
		System.out.println(question);
	}
	
}
