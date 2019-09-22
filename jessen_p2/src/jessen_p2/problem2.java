package jessen_p2;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int unitsChoice;
		double weightPounds;
		double weightKilos;
		double heightInches;
		double heightMeters;
		double bmi = 0;

		// Prompt user to enter data and route to standard or metric equation accordingly
		
		System.out.println("We will be calculating your BMI.  Please enter 1 to calculate in standard units or 2 to calculate in metric units:");

		unitsChoice = scnr.nextInt();

		if (unitsChoice == 1) {
			System.out.println("Please enter your weight in pounds:");
			weightPounds = scnr.nextDouble();

			System.out.println("Please enter your height in inches:");
			heightInches = scnr.nextDouble();

			bmi = ((703 * weightPounds) / (heightInches * heightInches));

			System.out.println("Your BMI is: " + bmi);
		}

		if (unitsChoice == 2) {
			System.out.println("Please enter your weight in kilograms:");
			weightKilos = scnr.nextDouble();

			System.out.println("Please enter your height in meters:");
			heightMeters = scnr.nextDouble();

			bmi = (weightKilos / (heightMeters * heightMeters));

			System.out.println("Your BMI is: " + bmi);
		}

		if (unitsChoice != 1 & unitsChoice != 2) {
			System.out.println("Please enter 1 to calculate in standard units or 2 to calculate in metric units:");
		}

		// Compare user's BMI to the table referenced
		
		String category = "";

		if (bmi < 8.5) {
			category = "Underweight";
		}

		if (bmi >= 18.5 & bmi < 25) {
			category = "Normal Weight";
		}

		if (bmi >= 25 & bmi < 30) {
			category = "Overweight";
		}

		if (bmi > 30) {
			category = "Obese";
		}

		System.out.println("Your BMI falls in the category: " + category);
	}

}
