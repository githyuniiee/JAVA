package arraylist;
import java.util.ArrayList;

import array.Dog;


public class DogTest {
	public void mmain(String[] args) {
	ArrayList<Dog> list = new ArrayList<Dog>();
	list.add(new Dog("멍멍이", "치아와"));
	list.add(new Dog("뽀삐", "진돗개"));
	list.add(new Dog("순심이", "삽살개"));
	list.add(new Dog("철이", "마르티스"));
	list.add(new Dog("삐쭈", "푸들"));	
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).showDogInfo());
	}
	
	for(Dog dog: list) {
		System.out.println(dog.showDogInfo());
	}
	}
}

