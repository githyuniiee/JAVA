import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.print("Input the first nummber: ");
		n1 = keyboard.nextInt();
		System.out.print("Input the second number: ");
		n2 = keyboard.nextInt();
		System.out.print("Input the third number: ");
		n3 = keyboard.nextInt();
		
		if(n1<n2 && n2<n3) {
			System.out.println("Increasing");
		}
		else if(n1>n2 && n2>n3) {
			System.out.println("Decreasing");
		}
		else
			System.out.println("Neither increasing or decreasing");
		

	}

}
