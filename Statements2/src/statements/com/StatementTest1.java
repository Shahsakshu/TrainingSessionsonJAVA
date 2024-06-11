package statements.com;
import java.util.Scanner;
public class StatementTest1 {
	public class StatementTest {
	    public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);
	        char choice;
	        
	        do {
	            System.out.println("try try but don't cry.");
	            System.out.println("enter the quantity");
	            int quantity = input.nextInt();
	            System.out.println("Enter the price");
	            int price = input.nextInt();
	            double total = quantity * price;
	            System.out.println("Total is:-" + total);
	            System.out.println("Do you want to program again? (Y/N)");
	            choice = input.next().charAt(0);
	        } while (choice == 'Y' || choice == 'y');
	        
	        System.out.println("Program ended.");
	        input.close();
	    }
	}


}
