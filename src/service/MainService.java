package service;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import model.Course;
import model.Degree;
import model.Grade;
import model.Person;
import model.Professor;
import model.Student;
//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 
public class MainService {

	

	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades= new ArrayList<Grade>();
	private static ArrayList<Person> allPersons= new ArrayList<Person>();
	
	
	/*
	public static boolean isStudent(t
) {
		for(Person tempPer :allPersons2) {
			if(tempPer instanceof Student) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		
	}
	/*
	public static void isStudent(ArrayList<Person> allPersons2) throws Exception{
		for(Person tempPer :allPersons2) {
			if(tempPer instanceof Student) {
				Student tempSt  =(Student)tempPer;
				System.out.println(tempSt);
			}
			else {
				throw new Exception ("No students in array");
			}
		}
		
	}
	
	public static void isProfessor(Person [] allPersons) throws Exception{
		for(Person tempPer :allPersons) {
			if(tempPer instanceof Professor) {
				Professor tempPr  =(Professor)tempPer;
				System.out.println(tempPr);
			}
			else {
				throw new Exception ("No professors in array");
			}
		}
		
	}
	
	
	public static boolean isProfessor(Person [] allPersons) {
		for(Person tempPer :allPersons) {
			if(tempPer instanceof Professor) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		
	}*/
	
	public static void main(String[] args) {
		Professor pr1 = new Professor();//John Big - default Professor
		Professor pr2 = new Professor("Karina", "Skirmante","312311-23126", Degree.mg);
		Professor pr3 = new Professor("Estere", "Vitola",  "123467-09853", Degree.mg);
		Professor pr4 = new Professor("Marcis", "Naktins","213174-86431", Degree.mg);
		


		Student st1 = new Student();//Lara Bernardes student
		Student st2 = new Student("Viktors", "Kokin", "123456-09876");
		Student st3 = new Student("Davyd", "Akimov", "121298-67894");
		
		allPersons.addAll(Arrays.asList(pr1, pr2, pr3, pr4, st1, st2, st3));
		
		for(Person tempPer : allPersons) {
			System.out.println(tempPer);
		}
		
		
		Course c1 = new Course();
		Course c2 = new Course("Data Structure", 2, pr3);
		Course c3 = new Course("Networking", 4, pr4);
		Course c4 = new Course("Object Oriented Programming I", 4, pr3);
		allCourses.addAll(Arrays.asList(c1, c2, c3, c4));
		
		for(Course tempCr: allCourses) {
			System.out.println(tempCr);
		}
		
		Grade gr1 = new Grade();
		Grade gr2 = new Grade(4, st3, c3);// 4 for Davyd in Networking
		Grade gr3 = new Grade(10, st3, c2);// 10 for Davyd in Data Structure
		Grade gr4 = new Grade(7, st2, c2); //7 for Viktors in Data Structure
		Grade gr5 = new Grade(8, st2, c3);//8 for Viktors in Networking
		Grade gr6 = new Grade(10, st2, c1);//8 for Viktors in JAVA
		Grade gr7 = new Grade(5, st1, c1);//5 for Lara in JAVA
		allGrades.addAll(Arrays.asList(gr1,gr2, gr3, gr4, gr5, gr6, gr7));
		
		for(Grade tempGr: allGrades) {
			System.out.println(tempGr);
		}
		
		try
		{
			System.out.println(st2.getName() + " " + st2.getSurname() + " -> "
				+calculateAVGForStudent(st2));
			
			System.out.println(st2.getName() + " " + st2.getSurname() + " -> "
					+calculateWeightedAVGForStudent(st2));
		
			System.out.println(st3.getName() + " " + st3.getSurname() + " -> "
				+calculateAVGForStudent(st3));
			
			System.out.println(st3.getName() + " " + st3.getSurname() + " -> "
					+calculateWeightedAVGForStudent(st3));
			
			
			System.out.println(c2.getTitle() + " -> " + calculateAVGInCourse(c2));
			System.out.println(c3.getTitle() + " -> " + calculateAVGInCourse(c3));
			
			
			System.out.println(pr4.getName() + " " + pr4.getSurname() + " leads " + 
					calculateHowManyCoursesbyProfessor(pr4) + " courses");
			
			System.out.println(pr3.getName() + " " + pr3.getSurname() + " leads " + 
					calculateHowManyCoursesbyProfessor(pr3) + " courses");
			
			System.out.println("------------------------");
			sortStudents();
			System.out.println("------------------------");
			for(Person tempPer :allPersons) {
				if(tempPer instanceof Student) {
					Student tempSt  =(Student)tempPer;
					System.out.println(tempSt.getName() + " " + tempSt.getSurname() + " -> "
						+calculateAVGForStudent(tempSt));
				}
			}
			
			Person temp = retrieveStudentByPersoncode("123456-09876");
			System.out.println("Retrieve student by person code " + temp);
			
			createStudent("Sarah", "Green", "148336-87771");
			
			System.out.println("Create student testing (Sarah) - ");
			for(Person tempPer :allPersons) {
				if(tempPer instanceof Student) {
					Student tempSt  =(Student)tempPer;
					System.out.println(tempSt.getName() + " " + tempSt.getSurname() );
				}
			}
			
			updateStudentbyPersonCode("Viktors", "Kokin",  "123456-09876");
			System.out.println("Update student testing Viktors - ");
			for(Person tempPer :allPersons) {
				if(tempPer instanceof Student) {
					Student tempSt  =(Student)tempPer;
					System.out.println(tempSt.getName() + " " + tempSt.getSurname() );
				}
			}
			
			deleteStudentByPersonCode("121298-67894");
			System.out.println("Delete student testing (David)");
			for(Person tempPer :allPersons) {
				if(tempPer instanceof Student) {
					Student tempSt  =(Student)tempPer;
					System.out.println(tempSt.getName() + " " + tempSt.getSurname() );
				}
			}
			
			deleteStudentByPersonCode("12431241224");
			System.out.println("Delete student testing (invalid)");
			for(Person tempPer :allPersons) {
				if(tempPer instanceof Student) {
					Student tempSt  =(Student)tempPer;
					System.out.println(tempSt.getName() + " " + tempSt.getSurname() );
				}
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

	

	public static float calculateAVGForStudent(Person inputStudent) throws Exception {
		if(inputStudent == null) throw new Exception("Problems with input");
		
		
		float sum = 0;
		int howMany = 0;
		
		
		for(Grade tempGr : allGrades) {
			if(tempGr.getStudent().equals(inputStudent)) {
				sum = sum + tempGr.getValue();
				howMany++;
			}
		}
		
		
		return sum/howMany;
			
	}
	
	//JAVA 6 and DataStructure 8 AVG = (6+8)/2 = 7
	//JAVA 6 (4CP) DataStructure 8 (2CP) = ((6 * 4CP) + (8 * 2CP))/ (4CP +2CP) = (24 +16)/6= 40/6 = 6.666
		
	public static float calculateWeightedAVGForStudent(Person inputStudent) throws Exception {
		if(inputStudent == null) throw new Exception("Problems with input");
		
		float sum = 0;
		int howManyCP = 0;
		
		
		for(Grade tempGr : allGrades) {
			if(tempGr.getStudent().equals(inputStudent)) {
				sum = sum + tempGr.getValue() * tempGr.getCourse().getCreditPoints();
				howManyCP = howManyCP + tempGr.getCourse().getCreditPoints();
			}
		}
		
		return sum/howManyCP;
		
	}
	
	
	public static float calculateAVGInCourse(Course inputCourse) throws Exception {
		if(inputCourse == null) throw new Exception("Problems with input");
		
		
		float sum = 0;		Professor pr2 = new Professor("Karina", "Skirmante","312311-2312", Degree.mg);
		Professor pr3 = new Professor("Estere", "Vitola",  "123467-09853", Degree.mg);
		Professor pr4 = new Professor("Marcis", "Naktins","213174-86431", Degree.mg);
		int howMany = 0;
		
		for(Grade tempGr: allGrades) {
			if(tempGr.getCourse().equals(inputCourse)) {
				sum = sum + tempGr.getValue();
				howMany++;
			}
		}
		
		return sum/howMany;
		
	}
	
	public static int calculateHowManyCoursesbyProfessor(Professor inputProfessor) throws Exception {
		if(inputProfessor == null) throw new Exception("Problems with input");
		
		int howMany = 0;
		
		
		for(Course tempCr : allCourses) {
			if(tempCr.getProfessor().equals(inputProfessor)) {
				howMany++;
			}
		}
		
		return howMany;
	}
	
	public static void sortStudents() throws Exception {
		
		for(Person tempPer :allPersons) {
			if(tempPer instanceof Student) {
				for(int i = 0; i < allPersons.size(); i++) {
					for(int j = 0; j < 	allPersons.size(); j++) {
						Person tempI = allPersons.get(i);
						Person tempJ = allPersons.get(j);
						if(calculateAVGForStudent(tempJ) < calculateAVGForStudent(tempI)) {
							Person temp  =  allPersons.get(i);
							allPersons.set(i, allPersons.get(j));
							allPersons.set(j, temp);
						}
					}
				}
			}
		}
	}
	//TODO
	//calculates how many professors have phd as degree
	
	public static int howManyProfessorsHavePHD() {
		
		int howMany = 0;
		for(Person tempPer :allPersons) {
			if(tempPer instanceof Professor) {
				Professor tempPr  =(Professor)tempPer;
				if(tempPr.getProfDegree().equals(Degree.phd)) {
					howMany++;
			}
		}
	}
		return howMany;
		
	}
	//calculates how many grades are smaller than 4 in specific course
	//calculates how many CP professor need to lead
	
	public static Person retrieveStudentByPersoncode(String inputPersonCode) throws Exception {
		if(inputPersonCode == null) throw new Exception ("Invalid input");
		
		for(Person tempPer :allPersons) {
			if(tempPer instanceof Student) {
				if(tempPer.getPersonCode().equals(inputPersonCode)) {
				   return tempPer;
			}
		}
	}
		throw new Exception("Student not found");
	
}
	public static void createStudent(String inputName, String inputSurname, String inputPersonCode) throws Exception {
		if(inputPersonCode == null || inputName == null || inputSurname == null) throw new Exception ("Invalid input");

		for(Person tempPer :allPersons) {
			if(tempPer instanceof Student) {
					if(tempPer.getPersonCode().equals(inputPersonCode)) throw new Exception ("Student with input person code already exists");
			else {
				Student newStudent = new Student(inputName, inputSurname, inputPersonCode);
				allPersons.add(newStudent);
				System.out.println("Meet new student -" + newStudent.toString() );
			}
		}
	}
}	
	public static void updateStudentbyPersonCode(String inputName, String inputSurname, String inputPersonCode) throws Exception{
		if(inputPersonCode == null || inputName == null || inputSurname == null) throw new Exception ("Invalid input");
		
		for(Person tempPer :allPersons) {
			if(tempPer instanceof Student) {
				Student tempSt  =(Student)tempPer;
					if(tempSt.getPersonCode().equals(inputPersonCode)) {
						tempSt.setName(inputSurname);
						tempSt.setSurname(inputSurname);
						return;
			}
			
		} throw new Exception("No student found with this person code");
	
	}
	}
	
	public static void deleteStudentByPersonCode(String inputPersonCode) throws Exception{
		if(inputPersonCode == null ) throw new Exception ("Invalid input");
		for(Person tempPer :allPersons) {
			if(tempPer instanceof Student) {
					if(tempPer.getPersonCode().equals(inputPersonCode)) {
				allPersons.remove(tempPer);
				return;
			}
		}
		throw new Exception("No student found with this person code");
	}
	}
}