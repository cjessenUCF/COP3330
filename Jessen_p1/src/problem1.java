import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// Prompt the user to enter a four digit integer; store integer in an array

		System.out.print("Enter four digit integer to be encrypted: ");
		String val = scnr.nextLine();

		char[] numbers = val.toCharArray();

		// Extract values for each digit to perform encryption process

		int numOnes = Character.getNumericValue(numbers[3]);
		int numTens = Character.getNumericValue(numbers[2]);
		int numHundreds = Character.getNumericValue(numbers[1]);
		int numThousands = Character.getNumericValue(numbers[0]);

		encrypt encryptor = new encrypt();
		encryptor.encryptNumbers(numOnes, numTens, numHundreds, numThousands);

		// Decrypt a given number
		// Prompt the user to enter a four digit integer; store integer in an array

		System.out.print("Enter four digit integer to be decrypted: ");
		String val2 = scnr.nextLine();

		char[] numbers2 = val2.toCharArray();

		// Extract values for each digit to perform decryption process

		numOnes = Character.getNumericValue(numbers2[3]);
		numTens = Character.getNumericValue(numbers2[2]);
		numHundreds = Character.getNumericValue(numbers2[1]);
		numThousands = Character.getNumericValue(numbers2[0]);

		decrypt decryptor = new decrypt();
		decryptor.decryptNumbers(numOnes, numTens, numHundreds, numThousands);

	}

}
