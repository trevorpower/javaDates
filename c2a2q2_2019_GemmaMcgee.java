package c2a2q2_2019_GemmaMcgee;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class c2a2q2_2019_GemmaMcgee {

    public static void main(String[] args) throws FileNotFoundException {
    // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        final int LEN = 3;

        String output = checkInputIsValid(in, 
            "Please enter 3 letters in the range of a - z: ", 
            "Input is invalid. Please enter 3 letters in the range of a - z: ", 
            LEN);

        int[] converted = convertLettersToInt(output, LEN);
        int total = getSum(converted);
        String outputTxt = collectedText(converted, total);

        String fileName = getDateForFile();

        PrintWriter outputFile = new PrintWriter(fileName + ".txt");
        try {
            outputFile.println("c1|c2|c3|sum");
            outputFile.println(outputTxt);
        } finally {
            outputFile.close(); // ensures printwriter gets closed if error occurs
            in.close();
        }
    }
	
    /**
    * check that the integer input is valid
    * @param in
    * @param prompt 
    * @param invalidEntry
    * @param len
    * @return string, when valid
    */
    public static String checkInputIsValid(Scanner in, String prompt, String invalidEntry, int len) {
        boolean goAhead = false;
        String letters = "";

        while(!goAhead) {
            System.out.println(prompt);
            if(in.hasNext()) {
                letters = in.next();
                // check input is letters and 3 characters long, using regex
                boolean correctInput = letters.matches("[a-zA-Z]{" + len + "}");
                if(correctInput) {
                    goAhead = true;
                }
            } else {
                in.next();
            }
            prompt = invalidEntry;
        }
        return letters;
    }  
	
    /**
    * unicode equivalent of ( a - z ) is 97 - 123, convert letters to lowercase
    * to match this, convert to unicode equivalent and minus 96 to get 1 - 26
    * @param letters
    * @param len
    * @return an array of integers representing place in alphabet
    */
    public static int[] convertLettersToInt(String letters, int len) {
        String[] letterArray = letters.toLowerCase().split("");
        int[] convertedChars = new int[len];

        for(int i = 0; i < letterArray.length; i++) {
            int universal = Character.codePointAt(letterArray[i], 0);
            convertedChars[i] = universal - 96;
        }	
        return convertedChars;
    }    
	
    /**
    * calculate sum of array of integers
    * @param arr
    * @return integer of sum
    */
    public static int getSum(int[] arr) {
        int sum = 0;

        for(int value : arr) {
            sum += value;
        }
    return sum;
    }
	
    /**
    * taking the values and replacing unwanted characters
    * @param numbers
    * @param SUM
    * @return string of values without unwanted characters
    */
    public static String collectedText(int[] numbers, int SUM) {
        String values = Arrays.toString(numbers).
            replaceAll(",", "").
            replaceAll("[^0-9]", " ").
            replaceAll(" ", "|").
            substring(1) + SUM;

	    return values;	
    }
	
    /**
    * get a filename based on today's date
    * @return date for the filename
    */
    public static String getDateForFile() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String fileName = date.format(formatter);

        return fileName;
    }
}

/*
* prompt the user for a 3 character string (a - z)
* validate the input
* convert each character to it's numerical equivalent
* calculate sum of the three numbers
* print numbers and sum to a file 
* - in csv format
* - first line containing headings
* - second line containing values
* - name of file with date program is run e.g. 20190110.txt
*/
