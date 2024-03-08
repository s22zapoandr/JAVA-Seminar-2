package service;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;
import model.Course;
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
		Course course1= new Course();
		System.out.println(course1);
		Course course2= new Course("JAVA", 4, pr2);
		System.out.println(course2);
		Course course3= new Course("Data Structures" , 4, pr3);
		System.out.println(course3);
		Grade g1 = new Grade();
		System.out.println(g1);
		Grade g2 = new Grade(2, st2, course2);
		System.out.println(g2);
		Grade g3 = new Grade(10, st3, course3);
		System.out.println(g3);
		
	}

}
