package PracticeMetthod;

import java.util.Scanner;

public class classesAndMethods {

	public static void printSpring() {
		System.out.println("This season is Spring, and flowers are blooming!");
	}
	
	public static void printSummer() {
		System.out.println("This season is Summer, and it is getting hoy!");
	}
	
	public static void printFall() {
		System.out.println("This season is Fall, and leaves are falling!");
	}
	
	public static void printWinter() {
		System.out.println("This season is Winter, and it is snowing!");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// calling with if statements

		Scanner input=new Scanner(System.in);
		
		int number=1;
		
		System.out.println("Please enter season (1=spring, 2=summer, 3=fall, 4=winter");
		number=input.nextInt();
		
		if(number==1)
		printSpring();
		
		if(number==2)
			printSummer();
			
		if(number==3)
			printFall();
			
		if(number==4)
			printWinter();
			
			
		
		
		
	}

}
