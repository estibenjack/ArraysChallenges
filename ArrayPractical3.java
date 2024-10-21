package arrays.challenges;

/*
 *	1.4		1.9		1.31		1.2
 *
 *	Write a program that stores the above 4 students' heights.
 *	Then calculate the average height and the tallest and smallest height.
 *
 */

public class ArrayPractical3 {

	public static void main(String[] args) {

		double[] heights = new double[] { 1.4, 1.9, 1.31, 1.2 };

		System.out.printf("The average height is: %.1f%n", calculateAverageHeight(heights));
		System.out.printf("The smallest height is: %.1f%n", calculateSmallestHeight(heights));
		System.out.printf("The tallest height is: %.1f%n", calculateTallestHeight(heights));

	}

	public static double calculateAverageHeight(double[] heightsArray) {
		double total = 0;
		for (double height : heightsArray) {
			total += height;
		}
		return total / heightsArray.length;
	}

	public static double calculateSmallestHeight(double[] heightsArray) {
		double smallestHeight = heightsArray[0];
		for (int i = 1; i < heightsArray.length; i++) {
			if (heightsArray[i] < smallestHeight) {
				smallestHeight = heightsArray[i];
			}
		}
		return smallestHeight;
	}

	public static double calculateTallestHeight(double[] heightsArray) {
		double tallestHeight = heightsArray[0];
		for (int i = 1; i < heightsArray.length; i++) {
			if (heightsArray[i] > tallestHeight) {
				tallestHeight = heightsArray[i];
			}
		}
		return tallestHeight;
	}

}
