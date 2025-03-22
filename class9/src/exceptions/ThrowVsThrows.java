package exceptions;

import java.util.Scanner;

public class ThrowVsThrows {

	public static void main(String[] args) {
		
		//Throws:  method signature before the body of the method keyword throws, alternative for try catch
		//Throw: inside the method, to forcefully throw an exception, customizing an exception
		System.out.println("Your age plz?");
		Scanner ui  = new Scanner(System.in);
		int age = ui.nextInt();
		
		if(age<18) {
			throw new ArithmeticException("you are not allowed"); 
		//	System.out.println("you are not allowed");
		}
			
		else {System.out.println("You are allowed");}
		
		System.out.println("Hello");
	}
		

}
