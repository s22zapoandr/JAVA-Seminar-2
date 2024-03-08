package model;

public class Grade {
	private long gID;
	private int value;
	private Student student;
	private Course course;
	
	private static long counter = 0;
	
	public long getgID() {
		return gID;
	}
	public void setgID() {
		this.gID= counter;
		counter++;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int imputValue) {
		if(imputValue > 0 && imputValue < 11) {
			this.value = imputValue;
		} else {
			this.value = 0;
		}
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student imputStudent) {
		if(imputStudent != null) {
			this.student = imputStudent;
		} else {
			this.student = new Student();
		}
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course imputCourse) {
		if(imputCourse != null) {
			this.course = imputCourse;
		} else {
			this.course = new Course();
		}
		
	}
	//Constructors
	
	public Grade() {
		setgID();
		setValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	
	public Grade(int value, Student student, Course course) {
		setgID();
		setValue(value);
		setStudent(student);
		setCourse(course);
	}
	
	public String toString() {
		return gID + " - " + value + ": " + student + "(Course :"+ course + ")";
	}
	
}
