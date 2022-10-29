
public class Person {

	private String name;
	private int age;
	public static int numberOfPeople;
	
	public Person() {
		name = "No name yet.";
		age = 0;
		numberOfPeople=0;;
	}
	
	public Person(String initialName, int initialAge) {
		name = initialName;
		age = initialAge;
		numberOfPeople++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static int getNumberOfPeople() {
		return numberOfPeople;
	}
}
