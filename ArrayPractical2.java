package arrays.challenges;

/*
 * Write a program that stores the following temperatures then outputs the average temperature.
 * 
 * 	3.4		4.2		9.0		2.2		4.5		6.4		3.1
 * 
 */

public class ArrayPractical2 {

	public static void main(String[] args) {

		double[] temperatures = new double[] { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };

		System.out.printf("The average temperature is: %.1f", calculateAverageTemp(temperatures));

	}

	public static double calculateAverageTemp(double[] temps) {
		double total = 0;

		for (double temp : temps) {
			total += temp;
		}

		return total / temps.length;
	}
}
