import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

class GradeLevelTest {

private GradeLevel gradeLevel;
	
	@Before
	public void before() {
		gradeLevel = new GradeLevel();
	}
	
	
	@Test
	public void testGradeA() {
		double correct = 90.35;
		double score = gradeLevel.grade(correct);
		assertTrue(correct == score);
	}
	
	@Test
	public void testGradeB() {
		double correct = 89.35;
		double score = gradeLevel.grade(correct);
		assertTrue(correct == score);
	}
	
	@Test
	public void testGradeC() {
		double correct = 77.35;
		double score = gradeLevel.grade(correct);
		assertTrue(correct == score);
	}
	
	@Test
	public void testGradeD() {
		double correct = 69.35;
		double score = gradeLevel.grade(correct);
		assertTrue(correct == score);
	}
	
	@Test
	public void testGradeF() {
		double correct = 55.35;
		double score = gradeLevel.grade(correct);
		assertTrue(correct == score);
	}

}
