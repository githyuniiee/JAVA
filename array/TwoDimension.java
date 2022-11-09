package array;

public class TwoDimension {

	public static void main(String[] args) {
		char [][]arr = new char[13][2];
		char A = 'a';

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=A;
				System.out.print(arr[i][j]);
				A++;
			}
			System.out.println();
		}
	}

}
