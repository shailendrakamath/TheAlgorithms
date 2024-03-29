package Conversions;

import java.util.Scanner;

/**
 * Converts any Octal number to a Binary number
 * 
 * @author Zachary Jones
 *
 */
public class OctalToBinary {

	/**
	 * Main method
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int o = sc.nextInt();
		System.out.println("Binary equivalent: " + convertOctalToBinary(o));
		sc.close();
	}
	
	/**
	 * This method converts an octal number
	 * to a binary number.
	 * 
	 * @param o The octal number
	 * @return The binary number
	 */
	public static String convertOctalToBinary(int o) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		getVal(scan, num);
		return convert(num);
	}

	static void getVal(Scanner scan, int num) {

		System.out.println("Octal to Binary");
		// Entering the needed number
		System.out.println("\nEnter the number : ");
		num = Integer.parseInt(scan.nextLine(), 8);
	}

	static String convert(int num) {

		String binary = Integer.toBinaryString(num);
		System.out.println("Binary Value is : " + binary);
		return binary;
	}
}