package in.ac.sharda;

public class Student implements IresultarrivedListner {

	private final int rollnumber;
	private final String name;
	private String email;

	public Student(int rn, String n, String email) {
		this.rollnumber = rn;
		this.name = n;
		this.email = email;
	}

	public void attendance() {
		System.out.println("Present sir");
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		return ((Student)obj)
				.getRollnumber()==rollnumber;
	}
		return false;
	}

	@Override
	public void resultArrived() {
		System.out.println("Result arribed chech now");
		
	}
}