
public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Liam", "Luna", "2019-1100");
		Student s1 = new Student("Mark Japeth", "Lariba", "2018-4157");
		
		System.out.println("Student Name: " + s1.idNumber + " " + s1.lastName + ", " + s1.firstName);
		System.out.println("Teacher Name: " + t1.idNumber + " " + t1.lastName + ", " + t1.firstName);
	}

}
