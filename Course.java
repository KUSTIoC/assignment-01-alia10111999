public class Course{
	
	private static String courseName;
	private String courseCode;
	//private String programName;
	private String programSession;
	private Paper paper;

	Course(String courseName,String courseCode,String programSession,Paper paper)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.programSession = programSession;
		this.paper = paper;
	}
	
	public void setcourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public String getCourseCode()
	{
		return courseCode;
	}

	public String toString()
	{
		return "\n\n\nCourse:" +courseName +"Course Code:  " +courseCode +"\nSession:  " +programSession +"\n" +paper;
	} 
}