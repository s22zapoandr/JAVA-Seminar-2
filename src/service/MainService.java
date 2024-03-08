package service;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;
import model.Course;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;




public class MainService {
	private static ArrayList<Professor>AllofProfessors = new
			ArrayList<Professor>();
	private static ArrayList<Student>AllofStudents = new
			ArrayList<Student>();
	private static ArrayList<Course>AllofCourses = new
			ArrayList<Course>();
	private static ArrayList<Grade>AllofGrades = new
			ArrayList<Grade>();
	
//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
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Skirmane", Degree.mg);
		Professor pr3 = new Professor("Estere", "Vitola", Degree.mg);
		AllofProfessors.addAll(Arrays.asList(pr1, pr2, pr3));
		Student st1 = new Student();
		Student st2 = new Student("Igors" , "Goncarovs");
		Student st3 = new Student("Anton" , "Volkov");
		AllofStudents.addAll(Arrays.asList(st1, st2, st3));
		Course c1= new Course();
		Course c2= new Course("JAVA", 4, pr2);
		Course c3= new Course("Data Structures" , 4, pr3);
		AllofCourses.addAll(Arrays.asList(c1, c2, c3));
		Grade g1 = new Grade();
		Grade g2 = new Grade(2, st2, c2);
		Grade g3 = new Grade(10, st3, c3);
		AllofGrades.addAll(Arrays.asList(g1, g2, g3));
		
		
		for(Professor tempProf : AllofProfessors) {
			System.out.println(tempProf);
		}
		for(Student tempSt : AllofStudents) {
			System.out.println(tempSt);
		}
		for(Course tempC : AllofCourses) {
			System.out.println(tempC);
		}
		for(Grade tempG : AllofGrades) {
			System.out.println(tempG);
		}
		
		try {
			System.out.println("Average grade for " + st1.getName() + " " + st1.getSurname() + " " + calculateAVG(st1) );
			System.out.println("Average weighted grade for " + st2.getName() + " " + st2.getSurname() + " " + calculateAVWG(st2) );
			System.out.println("Average grade for " + c1.getTitle() + ": " + courseAVG(c1));
			for()
			
		}
		
	
	}
		public static float calculateAVG(Student inputStudent) throws Exception{
			if(inputStudent == null) throw new Exception("Problems with input");
			
			float sum = 0;
			int howMany = 0;
			
			for(Grade tempG : AllofGrades) {
				if(tempG.getStudent().equals(inputStudent)) {
					sum += tempG.getValue();
					howMany++;
				}
			}
			return sum/howMany;
		}
		
		public static float calculateAVWG(Student inputStudent) throws Exception{
			if(inputStudent == null) throw new Exception("Problems with input");
			
			float sum = 0;
			float howManyCP = 0;
			
			for(Grade tempG : AllofGrades) {
				if(tempG.getStudent().equals(inputStudent)) {
					sum += tempG.getValue() * tempG.getCourse().getCreditpoints();
					howManyCP += tempG.getCourse().getCreditpoints();
				}
			}
			return sum/howManyCP;
		}
		public static float courseAVG(Course inputCourse) throws Exception{
			if(inputCourse == null) throw new Exception("Skill isuues");
			 
			float sum = 0;
			int howManyStudents = 0;
			
			for(Grade tempG : AllofGrades) {
				if(tempG.getCourse().equals(inputCourse)) {
					sum += tempG.getValue();
					howManyStudents++;
				}
			}
			return sum/howManyStudents;
		}
		public static int ProfCourseCount(Professor inputProfessor) throws Exception{
			if(inputProfessor == null) throw new Exception("Skill issues");
			
			int sum = 0;
			for(Course tempC : AllofCourses) {
				if(tempC.getProfessor().equals(inputProfessor)) {
					sum++;
				}
			}
			return sum;
		}
		
		public static void sortStudents() throws Exception{
			for(int i = 0; i < AllofStudents.size(); i++) {
				for(int j = 0; j < AllofStudents.size(); j++) {
					Student tempI = AllofStudents.get(i);
					Student tempJ = AllofStudents.get(j);
					if (tempI > tempJ) {
						
					}
				}
			}
		}
		
		
		
		
	}


