package statements.com;

import java.util.Scanner;

public class StatementTest {
	public static void main(String args[])
	{
		String answer;
		do{
			Scanner input=new Scanner(System.in);
		//char choice;
		//System.out.println("try try but don't cry.");
		System.out.println("enter the quantity");
		int quantity=input.nextInt();
		System.out.println("Enter the price");
		int price=input.nextInt();
		double total=quantity*price;
		System.out.println("Total is:-"+total);
		System.out.println("*************");	
		System.out.println("Do you want to perform again");
		answer=input.next();
	}while(answer.equals("Yes"));
		
}}
