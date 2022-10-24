import java.util.Scanner;
public class Test {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int lineCount;
      System.out.print("Enter a number: ");
      lineCount = keyboard.nextInt();
      int num = 1;
      
      int spaceCount = lineCount-1;
      
      for(int i=0; i<lineCount; i++) {
         for(int j=0; j<i+1; j++) {
         System.out.print(num);
         System.out.print(' ');
         num+=1;
         
         }
         for(int j=0; j<spaceCount; j++) {
            System.out.print(' ');
         }
         spaceCount-=1;
         System.out.println();
         
      }
      
   }
}