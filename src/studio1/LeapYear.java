package studio1;

import java.util.Scanner;

public class LeapYear 
{
	
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		System.out.println("What year is it?");
		int year = in.nextInt();
		
		int remFour = year % 4;
		
		int remHundred = year % 100;
		
		int remFourHundred = year % 400;
		
		boolean leapYear = ((remFour == 0) && (remHundred != 0) || (remFourHundred == 0));
				
		System.out.println("Is it a leap year?");
		System.out.println(leapYear);
		
		

	}
}
