
/**
  Mohammed Raza
  CSC 162 - Lab4 #2 (class 6)
*/

public class CourseGrades extends GradedActivity
{

   private final int NUM_GRADES	= 4;

   GradedActivity[] grades;

   public double labgrade;


	public CourseGrades(double lg)
	  {
		  super();

		  grades = new GradedActivity[NUM_GRADES];

   	  }

	public void setLab(double lg)
	{
		labgrade = lg;
		grades[0] = new GradedActivity();
		grades[0].setScore(85.0);

		// *** Professor, this is not working ***
		// Trying to pass 85.0 to element 0 of
		// the array, should store value in setScore
		// method of GradedActivity class.

	}


	public void setPassFailExam(int questions, int missed, double minPassing)
	{
		grades[1] = new PassFailExam(20,3,70);
	}


	public void setEssay(int g, int sp, int l, int c)
	{
		grades[2] = new Essay(25,18,17,20);
	}


	public void setFinalExam(int questions, int missed)
	{
		grades[3] = new FinalExam(50,10);
	}


	public String toString()
	{
		String str = " ";
		return str;
	}






}