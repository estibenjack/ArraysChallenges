package arrays.challenges;

/*
 * Challenge 6:
 * Create and array that will be populated with all the even numbers from 1 to 100.
 * Output the contents of the array and the total of all the even numbers.
 * 
 * Challenge 7:
 * Create a method that will output the contents of an array of ints (of any size) to screen.
 * 
 */

public class ArrayPractical6and7 {

	public static void main(String[] args) {

		int[] evenNumbers = new int[50];
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenNumbers[count] = i;
				count++;
			}
		}

		displayValues(evenNumbers, count);
		System.out.println();
		System.out.printf("The total of the even numbers from 1 to 100 is: %d", calculateTotal(evenNumbers, count));
	}

	public static void displayValues(int[] numbers, int count) {
		System.out.println("Even numbers from 1 to 100:");
		for (int i = 0; i < count; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static int calculateTotal(int[] numbers, int count) {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}
		return total;
	}

}
