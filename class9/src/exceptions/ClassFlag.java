package exceptions;

import java.util.Scanner;

public class ClassFlag {

	public static void main(String[] args) {
		System.out.println("Give a str");
		Scanner ui  = new Scanner(System.in);
		String str =  ui.nextLine();
		boolean flag = true;
		
		if(flag) {System.out.println("hello");}
		if(str.contains("W")) {
			flag=false;
			System.out.println("hello all");
		}
		

	}

}
