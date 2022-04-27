
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Liam", "Luna", "2019-1100");
		Teacher t1 = new Teacher();
		
		System.out.println("Student Name: " + s1.idNumber + " " + s1.lastName + ", " + s1.firstName);
		System.out.println("Teacher Name: " + t1.idNumber + " " + t1.lastName + ", " + t1.firstName);
	}

}
