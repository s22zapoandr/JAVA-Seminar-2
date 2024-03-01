package service;

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
	}

}
