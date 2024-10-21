package arrays.challenges;

/*
 * Write a program that calculates the salary for an employee who has worked
 * the following hours in a five day week:
 * 
 * Monday		8
 * Tuesday		7
 * Wednesday	9
 * Thursday 	7
 * Friday		4
 * 
 * The rate of pay is £10.25 per hour. The program should output the number
 * of hours worked each day, the total hours worked in the week and the
 * final weekly salary.
 * 
 * Use an array to store the hours and a Constant for the rate of pay.
 * 
 */

public class ArrayPractical1 {

	public static void main(String[] args) {

		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		int[] hoursWorked = { 8, 7, 9, 7, 4 };
		double rateOfPay = 10.25;

		System.out.println("Weekday \tHours");
		for (int i = 0; i < weekdays.length; i++) {
			if (i == 0 || i == 4) {
				System.out.printf("%s \t\t%d%n", weekdays[i], hoursWorked[i]);
			} else {
				System.out.printf("%s \t%d%n", weekdays[i], hoursWorked[i]);
			}
		}

		System.out.printf("The total hours worked this work: %d%n", calcTotal(hoursWorked));
		System.out.printf("The final weekly salary is: £%.2f", calcWeeklySalary(calcTotal(hoursWorked), rateOfPay));
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
