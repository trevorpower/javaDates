package c2a1q2_2018_GemmaMcgee;

import java.util.Scanner;

public class EnterDate {

    public static void main(String[] args) {
    // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in); 
        String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] daysOfYear = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};

        int monthOfYear = getIntegerInputInRange(in, 1, 12, "Please enter a month from 1(January) to 12(December): ");
        int dateOfYear = 0;

        if (monthOfYear == 1 || monthOfYear == 3 || monthOfYear == 5 || monthOfYear == 7 || monthOfYear == 8 || monthOfYear == 10 || monthOfYear == 12) {
            dateOfYear = getIntegerInputInRange(in, 1, 31, "Please enter a valid date: ");
        } else if(monthOfYear == 2) {
            dateOfYear = getIntegerInputInRange(in, 1, 29, "Please enter a valid date: ");
        } else if(monthOfYear == 4 || monthOfYear == 6 || monthOfYear == 9 || monthOfYear == 11) {
            dateOfYear = getIntegerInputInRange(in, 1, 30, "Please enter a valid date: ");
        }		

        System.out.println("The date entered is the " + daysOfYear[dateOfYear-1] + " of " + monthsOfYear[monthOfYear-1]);

        in.close();
    }
    /**
    * @param in - the Scanner object
    * @param minimum - minimum value in the range
    * @param maximum - maximum value in the range
    * @param prompt - what the user is asked for
    * @return - an integer if it is valid input
    */
    public static int getIntegerInputInRange (Scanner in, int minimum, int maximum, String prompt) {

        boolean validInput = false;
        int numberInput = 0;

        while(!validInput) {
            System.out.print(prompt);
            if(in.hasNextInt()) {
	        numberInput = in.nextInt();
                if (numberInput >= minimum && numberInput <= maximum) {
	            validInput = true;
                } 
            } else {
	    in.next();
            }
        }
        return numberInput;
    }
}






