package arrays.challenges;

/*
 *	Write a program that will prompt the user to enter their first name.
 *	This will be stored as a string. The program will then loop through 
 *	the string and assign a value to a char array. Count the occurrences
 *	of the different vowels: a, e, i, o, u. The program should take into
 *	account both lowercase and uppercase characters. 
 *	The total number of occurrences for each vowel should be calculated and
 *	displayed.
 *
 */

import java.util.Scanner;

public class ArrayPractical5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String firstName;
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

		System.out.println("Let's see how many vowels are in your name!");
		System.out.print("Please enter your first name: ");
		firstName = scanner.nextLine();

		String lowerCaseName = firstName.toLowerCase();

		char[] charsInName = new char[firstName.length()];
		for (int i = 0; i < lowerCaseName.length(); i++) {
			charsInName[i] = lowerCaseName.charAt(i);
		}

		for (int i = 0; i < charsInName.length; i++) {
			switch (charsInName[i]) {
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			}
		}

		int totalVowelCount = aCount + eCount + iCount + oCount + uCount;

		System.out.printf("Your name is: %s, and it contains %d vowels in total.\n", firstName, totalVowelCount);
		System.out.printf("A: \t%d%n", aCount);
		System.out.printf("E: \t%d%n", eCount);
		System.out.printf("I: \t%d%n", iCount);
		System.out.printf("O: \t%d%n", oCount);
		System.out.printf("U: \t%d%n", uCount);
		
		scanner.close();
	}

}
