package exceptions;

import java.util.Scanner;

public class duplicatecharacters {

	public static void main(String[] args) {
		System.out.println("Give a str");
		Scanner ui  = new Scanner(System.in);
		String str = ui.nextLine();  //p: 2  // l:3, o:2
		char[] strChar = str.toCharArray();
		int i; int j;
		int count;
		
		for(i=0; i<strChar.length; i++) {
			count=1;
			for(j=i+1; j<strChar.length; j++) {
				if(strChar[i]==strChar[j]  && strChar[i]!=' ' ) {
					count++;
					strChar[j]='0';
				}
				
			}
			if(count>1 && strChar[i]!='0') {
				System.out.println(strChar[i] + ":  " + count);
			}
		}

	}

}
