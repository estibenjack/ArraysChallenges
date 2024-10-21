package arrays.challenges;

/*
 * In the software industry, programmers are commonly required to alter existing programs.
 * 
 *  Part one:
 *  - Alter the hours and wages program to enable it to deal with a six day working week.
 *    The rate of pay has increased to £11.50 per hour. Use suitable test data to test your changes.
 *    
 *  Part two:
 *  - Alter the temperatures program to calculate the maximum and minimum temperature each week
 */

public class ArrayPractical4Part1 {

	public static void main(String[] args) {

		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int[] hoursWorked = new int[] { 8, 7, 9, 7, 4, 5 };
		// int[] testArray1 = new int[] {8, 8, 8, 8, 4, 2};
		// int[] testArray2 = new int[] {4, 3, 4, 5, 2, 7};
		// int[] testArray3 = new int[] {3, 5, 6, 7, 8, 8};
		
		double rateOfPay = 11.50;

		displayHoursWorked(hoursWorked, weekdays);

		System.out.printf("The total hours worked this work: %d%n", calcTotal(hoursWorked));
		System.out.printf("The final weekly salary is: £%.2f", calcWeeklySalary(calcTotal(hoursWorked), rateOfPay));
	}
	
	public static void displayHoursWorked (int[] hoursArray, String[] days) {
		System.out.println("Weekday \tHours");
		for (int i = 0; i < hoursArray.length; i++) {
			if (i == 0 || i == 4) {
				System.out.printf("%s \t\t%d%n", days[i], hoursArray[i]);
			} else {
				System.out.printf("%s \t%d%n", days[i], hoursArray[i]);
			}
		}
	}

	public static int calcTotal(int[] hoursArray) {
		int total = 0;
		for (int day : hoursArray) {
			total += day;
		}
		return total;
	}

	public static double calcWeeklySalary(int totalHours, double payRate) {
		return totalHours * payRate;
	}
}
