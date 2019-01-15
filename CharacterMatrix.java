package c2a1q3_2018_GemmaMcgee;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class CharacterMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int x = checkIntegerInputIsValid(in, 5, 10, "Enter a number between 5 and 10: ");
		String letters = checkStringInputIsValid(in, 6, "Enter 6 characters here: ");
		
		String outputString = getNewConcatenatedCharacters(x, letters);
		
		System.out.println(outputString);
		
		
	}
	
	public static int checkIntegerInputIsValid(Scanner in, int minimum, int maximum, String prompt) {
		
		boolean validInput = false;
		int numberInput = 0;
		
		while(!validInput) {
			System.out.print(prompt);
			if(in.hasNextInt()) {
				numberInput = in.nextInt();
				if(numberInput >= minimum && numberInput <= maximum) {
					validInput = true;
				}
			} else {
				in.next();
			}
		}	
		return numberInput;	
	}
	
	
    public static String checkStringInputIsValid(Scanner in, int len, String prompt) {
		
		boolean validInput = false;
		String stringInput = "";
		
		while(!validInput) {
			System.out.print(prompt);
			if(in.hasNext()) {
				stringInput = in.next();
				if(stringInput.length() == len) {
					validInput = true;
				}
			} else {
				in.next();
			}
		}
		
		return stringInput;
		
	}
    
    
    public static int[] getRandomNumbersForIndexPositions(int amount) {
    	
    	int[] indexesOf = new int[amount];
    	
    	for (int i = 0; i < amount; i++) {
    		Random r = new Random();
        	int y = r.nextInt((5 - 0) + 1);
    		indexesOf[i] = y;
    	}
    	return indexesOf;	
    }
    
    
    
    public static String getNewConcatenatedCharacters(int size, String letters) {
    
    	int numberOfChars = size * size;
    	
    	char[] matrix = new char[size];
    	ArrayList matrixList = new ArrayList(); 
    	String oddNumbers = "";
    	
		for (int j = 0; j < size; j++) {
    		for (int i = 0; i < matrix.length; i++) {
    			int[] indexes = getRandomNumbersForIndexPositions(size);
    			char letter = letters.charAt(indexes[i]);
        		matrix[i] = letter;
        		matrixList.add(matrix[i]);
        		System.out.print(matrix[i] + " ");	
        	}	
    		System.out.println();
    	}
		
		int len = matrixList.size();
		
		for (int k = 0; k < len; k++) {
			if (k % 2 == 0) {
				oddNumbers += matrixList.get(k);
			}
			k++;		
		}
		
		int half = (size + 1) / 2;
		String[] odds = oddNumbers.split("(?<=\\G.{" + half + "})");
		String gotcha = "";
		
		for (int l = 0; l < odds.length; l++) {
			if (l % 2 == 0) {
				gotcha += odds[l];
			}
		}

    	return "Odd letters from every odd row: " + gotcha;		 		
    
    }
    
 // request user to enter number between 5 and 10 (x)
    // validate that number is between 5 and 10
 // request user to enter a character string of length 6 (y)
    // validate that string length is 6
 // write a method that creates a matrix of random characters from string entered
    // pass both user inputs into method
    // times x by x to get z
    // take a character at random from y (z times) and enter into string or array
    // split the array at x and enter a new line each time
// return concat characters from every odd cell from every odd row in matrix
    // assuming each line has an id find every odd numbered line
    // push the odd characters in each line to a new array and return

}
    
