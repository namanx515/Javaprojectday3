package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s= new Student(1,"Naman","n@gmail.com");
		Student s2= new Student(2,"NAman","k@gmail.com");
		s.getRollnumber();
		System.out.println(s.equals(s2));
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
	}

}
