package in.ac.sharda;

public class Uniersitydemo {

	public static void main(String[] args) {
		University u=new University();
		for(int i=1;i< 21;i++) {
			Department d= new Department(i);
			 boolean added = u.addDepartment(new Department(i));
		if(added) {
			System.out.println("Department added");
			for(int j= 1; j<21 ;j++) {
				d.addstudent(new Student(i,"Name"+i,null));
			}
			
		}else {
			System.out.println("not added");
		}
		}
		
           u.printDepartment();
	}

}
