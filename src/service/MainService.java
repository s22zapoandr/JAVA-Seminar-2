package service;

import model.Course;
import model.Degree;
import model.Professor;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Skirmane", Degree.mg);
		System.out.println(pr2);
		Professor pr3 = new Professor("Estere", "Vitola", Degree.mg);
		System.out.println(pr3);
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Igors" , "Goncarovs");
		System.out.println(st2);
		Student st3 = new Student("Anton" , "Volkov");
		System.out.println(st3);
		Course course1= new Course("Course", 5, pr1);
		System.out.println(course1);
		Course course2= new Course("JAVA", 4, pr2);
		System.out.println(course2);
		Course course3= new Course("Data Structures" , 4, pr3);
		System.out.println(course3);
	}

}
