package model;

public class Course {
	private long CID;
	private String title;
	private int creditpoints;
	private Professor professor;
	public long getCID() {
		return CID;
	}
	public void setCID(long cID) {
		CID = cID;
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
	
	
}
