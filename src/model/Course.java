package model;
public class Course {
	private long cID;
	private String title;
	private int creditpoints;
	private Professor professor;
	
	
	int counter = 0;
	
	public long getcID() {
		return cID;
	}
	public void setcID() {
		cID = counter;
		counter++;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.matches("[A-Za-z 0-9]{4, 40}"))
			this.title = title;
		else
			this.title = "Undefined";
	}
	public int getCreditpoints() {
		return creditpoints;
	}
	public void setCreditpoints(int creditpoints) {
		if(creditpoints > 0 && creditpoints <= 20)
			this.creditpoints = creditpoints;
		else
			this.creditpoints = 0;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		if(this.professor != null)
			this.professor = professor;
		else
			this.professor = new Professor();
	}
	 // Constructors
	
	public Course() {
		setcID();
		setTitle("Course title");
		setCreditpoints(5);
		setProfessor(new Professor());
	}
	public Course(long cID, String title, int creditPoints, Professor professor) {
		setcID();
		setTitle(title);
		setCreditpoints(creditPoints);
		setProfessor(professor);
	}
	
	
}
