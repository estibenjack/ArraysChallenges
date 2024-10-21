package arrays.challenges;

/*
 * In the software industry, programmers are commonly required to alter existing programs.
 * 
 * 	Part one:
 *  - Alter the hours and wages program to enable it to deal with a six day working week.
 *    The rate of pay has increased to £11.50 per hour. Use suitable test data to test your changes.
 *    
 *  Part two:
 *  - Alter the temperatures program to calculate the maximum and minimum temperature each week
 */

public class ArrayPractical4Part2 {

	public static void main(String[] args) {

		double[] temperatures = new double[] { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };

		System.out.printf("The average temperature is: %.1f%n", calculateAverageTemp(temperatures));
		System.out.printf("The maximum temperature is: %.1f%n", calculateMaxTemp(temperatures));
		System.out.printf("The minimum temperature is: %.1f%n", calculateMinTemp(temperatures));

	}

	public static double calculateAverageTemp(double[] temps) {
		double total = 0;

		for (double temp : temps) {
			total += temp;
		}

		return total / temps.length;
	}

	public static double calculateMaxTemp(double[] temps) {
		double maxTemp = temps[0];
		for (int i = 1; i < temps.length; i++) {
			if (temps[i] > maxTemp) {
				maxTemp = temps[i];
			}
		}
		return maxTemp;
	}

	public static double calculateMinTemp(double[] temps) {
		double minTemp = temps[0];
		for (int i = 1; i < temps.length; i++) {
			if (temps[i] < minTemp) {
				minTemp = temps[i];
			}
		}
		return minTemp;
	}
}
