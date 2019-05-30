package in.ac.sharda;

public class Departmentdemo {

	public static void main(String[] args) {

       Department d= new Department(0);
       d.addstudent(new Student(1,"Naman","k"));
       d.addstudent(new Student(2,"Naman","k"));
       d.addstudent(new Student(3,"Naman","k"));
       d.printStudents();


	}

}
