package c2a1q1_2018_GemmaMaryMcGee;

import java.io.File;
import java.util.Scanner;

public class ManipulatingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your string: ");

		Scanner in = new Scanner(System.in);
		String encodedPhrase = in.next();

		// minimize repetitevness of code by storing this in variable 
		char x = encodedPhrase.charAt(0);

		// store in variable so the program doesn't run the method each time
		int len = encodedPhrase.length();

		if (x == 'u') { // if string begins with u, convert to uppercase
			System.out.println(encodedPhrase.toUpperCase());
		} else if (x == 'l') { // if string begins with l, convert to lowercase
			System.out.println(encodedPhrase.toLowerCase());
		} else if (x == 'o') { // if string begins with o, loop through and print character at odd indexes
			for (int i = 0; i < len; i++) {	
				char letter = encodedPhrase.charAt(i);
				if (i % 2 != 0) { // if the remainder of i/2 is not 0, then it is an odd number 
				System.out.print(letter);
				}
			}
		} else if (x == 'e') { // if the string begins with e, do the same as above but with even indexes
			for (int i = 0; i < len; i++) {	
				char letter = encodedPhrase.charAt(i);
				if (i % 2 == 0) {
				System.out.print(letter);
				}
			}
		} else if (Character.isDigit(x)) { // if the string begins with a number
			int y = x-'0'; // -'0' converts the digit into an integer
			System.out.print(encodedPhrase.substring(0, y)); // print the substring
		} 
	}
}
