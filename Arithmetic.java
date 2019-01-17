package c2a2q1_2019_GemmaMcgee;

import java.util.Scanner;
import java.util.Arrays;

/**
* @author gemmi
*/
public class Arithmetic {
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number below 6 times in order to calculate their sum and average.");

        final int NO_OF_INTEGERS = 6;
    
        int[] results = addInputIntegersToArray(in, NO_OF_INTEGERS);

        int sum = calculateSum(results);
        double average = calculateAverage(sum, NO_OF_INTEGERS);

        System.out.println("The sum of your input is " + sum + " and the average of the numbers is " + average);
    }

    /**
    * check the input from the user is valid, if not prompt user again
    * @param in 
    * @param min 
    * @param max 
    * @param prompt 
    * @param invalidInput 
    * @return an int between 1 and 30 
    */
    public static int checkIntegerInputIsValid(Scanner in, int min, int max, String prompt, String invalidInput) {
        boolean validInput = false;
        int numberInput = 0;

        while(!validInput) {
            System.out.print(prompt);
            if(in.hasNextInt()) {
                numberInput = in.nextInt();
                if(numberInput >= min && numberInput <= max) {
                    validInput = true;
                }
            } else {
                in.next();
            }
            prompt = invalidInput; // change the prompt after the first invalid try
        }
        return numberInput;
    }

    /**
    * call the checkIntegerInputIsValid method while looping through 
    * numbersArray to get an input for each item and add to the array  
    * @param in
    * @param amountOfNumbers
    * @return an array of integers between 1 and 30
    */
    public static int[] addInputIntegersToArray(Scanner in, int amountOfNumbers) {
        int[] numbersArray = new int[amountOfNumbers];

        for(int i = 0; i < numbersArray.length; i++){ 
            int x = checkIntegerInputIsValid(in, 1, 30, "Enter a number between 1 and 30 (inclusive): ", 
                "Input should be a number between 1 and 30. Please try again: ");
            numbersArray[i] = x;
        }	
        return numbersArray;	
    }

    /**
    * calculate the sum of numbers in an array 
    * @param inputIntegers
    * @return sum of the numbers
    */
    public static int calculateSum(int[] inputIntegers) {
        int sum = 0;

        for(int value : inputIntegers) {
            sum += value;
        }
        return sum;
    }

    /**
    * calculate the average of a set of numbers
    * @param total
    * @param len
    * @return a double representing the average of a sum of numbers
    */
    public static double calculateAverage(double total, double len) {
        double average = 0;

        if(len > 0) {
            average = total / len;
        }
        return average;	
    }
}


/*
* 1. get user input of an integer value
* 2. validate user input is between 1 and 30
* 3. if false, prompt user to enter again
* 4. if true, store user input in an array 
* 5. prompt user again until length of array is 6
* 6. calculate sum of integers array
* 7. calculate average of integer array 
* 8. output to user 		 * 
*/
