
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab4 #2 (main)
*/

public class CourseGradesDemo
{
   public static void main(String[] args)
   {

	  Scanner keyboard = new Scanner(System.in);


	  CourseGrades lab = new CourseGrades(85.0);

	  PassFailExam pfexam = new PassFailExam(20,3,70);

	  Essay ess = new Essay(25,18,17,20);

	  FinalExam fexam = new FinalExam(50,10);


	  System.out.println("Scores");

	  System.out.println("");

	  System.out.println("Lab: Score: " + lab.getScore() + ", Letter Grade: " + lab.getGrade());

	  System.out.println("Pass/Fail Exam: " + pfexam.getScore() + ", Letter Grade: " + pfexam.getGrade());

	  System.out.println("Essay: " + ess.getScore() + ", Letter Grade: " + ess.getGrade());

	  System.out.println("Final Exam: " + fexam.getScore() + ", Letter Grade: " + fexam.getGrade());

	  System.out.println("");

   }
}
