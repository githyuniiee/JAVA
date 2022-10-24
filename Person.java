
public class Person {
	private String name;
	private int age;
	
	public Person(String initialName, int initialAge) {
		name = initialName;
		age = initialAge;
	}
	
	public void isAdult() {
		
		System.out.print("The person is ");
		System.out.println(age >= 20 ? "adult." : "not adult.");
	}
}
